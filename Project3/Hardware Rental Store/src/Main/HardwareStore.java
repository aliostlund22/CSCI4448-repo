package Main;

import Customers.Customer;
import Customers.CustomerFactory;
import Tools.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// OOP Project 3
// Project SDK: Java 1.8
// Text editors/IDEs: IntelliJ, Eclipse, Sublime Text
// Authors: Thadeus Labuszewski, Ali Ostlund, Fedrico Arragon
// Favorite color: orange


// Main.Main class for running store, all of our store logic is built here
public class HardwareStore {

	// Main.HardwareStore Variables
	public float profit;
	public CustomerFactory customerFactory;
	public ToolFactory toolFactory;
	public List<RentalRecord> currentRentalsList;
	public List<RentalRecord> completedRentalRecordList;
	public List<Customer> listOfCustomersTotal;
	public List<Tool> listOfToolsTotal;

	// Default store singleton
	private static HardwareStore singletonHardwareStore = new HardwareStore();

	// Default constructor where we initialize everything
	private HardwareStore(){
		this.profit = 0;
		currentRentalsList = new ArrayList<RentalRecord>();
		completedRentalRecordList = new ArrayList<RentalRecord>();
		customerFactory = new CustomerFactory();
		toolFactory = new ToolFactory();
		listOfCustomersTotal = customerFactory.getListOfCustomers();
		listOfToolsTotal = toolFactory.getListOfTools();
	}

	// Singleton method
	public static HardwareStore getInstance(){
		if (singletonHardwareStore == null) {
			singletonHardwareStore = new HardwareStore();}
		return singletonHardwareStore;
	}

	// Methods for printing (wish I did this earlier with the other prints in the main would make everything a lot neater)
	public String customerInStorePrintStatement(Customer customer){
		String str = customer.customerName+ " [" +customer.customerType + "] walks into our the store...";
		return str;
	}

	public String customerRentPrintStatement(RentalRecord rentalRecord){
		String str = rentalRecord.customer.customerName + " [" + rentalRecord.customer.customerType + "]" + "  has just returned a " + rentalRecord.tool.name + "!";
		return str;
	}

	public String rentalRecordCreationPrintStatement(Customer customer, Tool currentTool, int days, double totalCost){
		String str = customer.customerName + " [" +customer.customerType + "] has decided to rent out a "+ currentTool.getToolName() + " for " + days + " days with a bill of $" + totalCost + ".";
		return str;
	}

	// Return random int based on bound
	public int getRandomInt(int bound){
		Random rand = new Random();
		int randomInteger = rand.nextInt(bound);
		return randomInteger;
	}

	// Method for picking an add on
	public ArrayList<AddOns> pickRandomAddOns(){
		ArrayList<AddOns> AddOnOptions = new ArrayList<AddOns>();
		Random rand = new Random();
		int amount = rand.nextInt(6) + 1 ;
		for (int i = 0; i <= amount; i++){
			if(i % 3 == 0){
				AddOns extensionCord = new ExtensionCord();
				//System.out.println("Test: " + extensionCord.setPrice(4.0));
				AddOnOptions.add(extensionCord);
			}
			else if (i % 3 == 1){
				AddOns protectionKit = new ProtectionGearKit();
				AddOnOptions.add(protectionKit);
			}
			else {
				AddOns accessoryKit = new AccessoryKit();
				AddOnOptions.add(accessoryKit);
			}

		}
		/*
		for(Tools.AddOns addOns: AddOnOptions){

			System.out.println(addOns.getPrice());
		}
		*/

		//System.out.println("!!!!!!!!!!!!!!!!!!!!" + AddOnOptions + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return AddOnOptions;
	}

	public void pickRandomCustomer(){
		for(Customer customer: listOfCustomersTotal){
			// Each time we hit a different customer we pick a random number x and if x% 3 == 0 then we will choose that customer
			// Easiest way of doing random that i can think of we can change it later if need be
			int randomInt = getRandomInt(2);
			int toolListLength = listOfToolsTotal.size();
			int rentalDaysLeftPerCustomer = customer.rentalDaysPerCustomer;
			String customerType = customer.customerType;

			// pick the customer
			if(randomInt % 3 == 0){
				System.out.println(customerInStorePrintStatement(customer));
				// Customers.Business customer case
				// Start with this one its the easiest
				if( toolListLength >=3 && customerType.equals("business") ){
					// Customers.Business customers rent always rent 3 tools for 7 days
					for(int i = 0; i <= 2; i ++){
						rentSingleTool(customer, 7);
					}
				// Make sure there are still tools in our inventory
				}else if(( (toolListLength > 0) && (rentalDaysLeftPerCustomer) > 0) ){
					if(customerType.equals("casual")){
						// Customers.Casual customer can rent 1-2 days
						int daysRentedForUniqueCustomer = getRandomInt(2);
						// So we dont get 0 days
						while (daysRentedForUniqueCustomer == 0){
							daysRentedForUniqueCustomer = getRandomInt(2);
						}

						// Customers.Casual customer can rent 1-2 tools
						int daysRentedForUniqueTool = getRandomInt(2);
						while (daysRentedForUniqueTool == 0){
							daysRentedForUniqueTool = getRandomInt(2);
						}

						// rentOneTool a random amount of times based on casual customer requirements
						for(int i=0; i<= daysRentedForUniqueCustomer; i++){
							rentSingleTool(customer, daysRentedForUniqueTool);
						}
					}else if (customerType.equals("regular")){

						// Customers.Regular customers can rent 3-5 days
						int daysRentedForUniqueCustomer = getRandomInt(5);
						while (daysRentedForUniqueCustomer ==0){
							daysRentedForUniqueCustomer = getRandomInt(5);
						}
						// Customers.Regular customers can rent 1-3 tools
						int daysRentedForUniqueTool = getRandomInt(3);
						while (daysRentedForUniqueTool == 0){
							daysRentedForUniqueTool = getRandomInt(3);
						}
						// rentOneTool a random amount of times based on regular customer requirements
						for(int i=0; i<= daysRentedForUniqueTool; i++){
							rentSingleTool(customer, daysRentedForUniqueCustomer);
						}
					}
				}
			}
		}
	}

	// Method used to calculate add on price of our rental
	public double calculateAddOnPrice(ArrayList<AddOns> listOfAddOns){
		double addOnTotalPrice = 0.0;
		for(AddOns addOns: listOfAddOns){
			addOnTotalPrice += addOns.getToolPrice();
		}
		return addOnTotalPrice;
	}

	// Update rental list after each day
	public void updateRentalList(){
		System.out.println("Tools returned today: ");
		//Use an iterator because its easiest way of doing this
		// We got the code for this iterator from https://www.java67.com/2014/03/2-ways-to-remove-elementsobjects-from-ArrayList-java.html#targetText=There%20are%20two%20ways%20to,i.e.%20remove(Object%20obj).
		Iterator<RentalRecord> rentalListIterator = currentRentalsList.iterator();
		while (rentalListIterator.hasNext()) {
			RentalRecord currentRentalRecord = rentalListIterator.next();
			// Check to see if we need to return a particular tool
			if(currentRentalRecord.daysLeftForRental != 0){
				// Subtract a day from tool rental if we still have days left
				currentRentalRecord.daysLeftForRental -=1;

			}else{
				// Return rental
				currentRentalRecord.customer.rentalDaysPerCustomer++;
				// Add tool back to the list
				listOfToolsTotal.add(currentRentalRecord.tool);
				// Remove the currentRentalRecord from our iterator
				rentalListIterator.remove();
				System.out.println(customerRentPrintStatement(currentRentalRecord));
			}
		}
	}

	// Pick a random tool from a tool list
	public Tool pickRandomToolFromAvailableList(int toolListLength){
		Random rand = new Random();
		int index = rand.nextInt(toolListLength);
		Tool tool = listOfToolsTotal.remove(index);
		return tool;
	}

	public void rentSingleTool(Customer customer, int daysRented){

		int toolListLength = this.listOfToolsTotal.size();
		// If we dont have any tools left then we cant rent anything out
		if(toolListLength != 0){
			// Decrement rental period
			customer.rentalDaysPerCustomer = customer.rentalDaysPerCustomer - 1 ;

			// Get random currentTool
			Tool currentTool = pickRandomToolFromAvailableList(toolListLength);
			ArrayList<AddOns> listOfAddOns = pickRandomAddOns();

			double addOnTotalCost = calculateAddOnPrice(listOfAddOns);
			String addOnNames = "Addons bought with purchase: ";
			for(AddOns addOns: listOfAddOns){
				addOnNames += addOns.name + ", ";
			}

			// Calculate money related variables
			double totalCost = calculateTotalPrice(currentTool, daysRented, addOnTotalCost);
			this.profit += totalCost;

			// Create a new rental record
			RentalRecord newRentalRecord = new RentalRecord(customer, currentTool, daysRented, totalCost);
			currentRentalsList.add(newRentalRecord);
			completedRentalRecordList.add(newRentalRecord);
			System.out.println(rentalRecordCreationPrintStatement(customer, currentTool, daysRented, totalCost));
			System.out.println(addOnNames + " Price: " + addOnTotalCost);

		}else{
			return;
		}
	}

	public double calculateTotalPrice(Tool currentTool, double days, double addOnTotalCost){
		double costWOAddOns = currentTool.getToolPrice()*days;
		double totalCost = costWOAddOns + addOnTotalCost;
		return totalCost;
	}
}
