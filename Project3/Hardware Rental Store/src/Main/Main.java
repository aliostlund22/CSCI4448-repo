package Main;

import Tools.Tool;

public class Main {

	public static void main(String args[]){

		// Simulation store
		// We only need one store so were using a singleton pattern here
		HardwareStore BoulderHardware = HardwareStore.getInstance();

		System.out.println("Welcome to Boulder hardware... Let us know if you have any questions!!!!!!");

		// Run through 35 days of simulation
		for(int i=0; i<=34; i++){

			System.out.println("---------------------Current Day: "+ i + " -----------------------------");
			//BoulderHardware.daySimulation();
			double startingProfit = BoulderHardware.profit;
			System.out.println("Our current inventory: ");

			for(Tool tool: BoulderHardware.listOfToolsTotal){
				System.out.println("[" + tool.getToolName() + ", $"+ tool.getToolPrice() + "], ");
			}
			System.out.println("Number of tools currently in our inventory: "+ BoulderHardware.listOfToolsTotal.size());
			// Loop through list of customers and pick them based off a random int
			BoulderHardware.pickRandomCustomer();
			// Update our list of active rentals and calculate daily profit
			BoulderHardware.updateRentalList();
			// Calculate profit and print
			double pro = BoulderHardware.profit - startingProfit;
			System.out.println("Amount of money our store made today: " + pro);
			System.out.println("---------------------End of day " + i + " ----------------------------\n");
		}

		// Create a report at the end of the season
		System.out.println("-----------------------End of season report------------------------");

		System.out.println("--------------------Completed rental list-----------------------\n");
		for(RentalRecord rentalRecord : BoulderHardware.completedRentalRecordList){
			System.out.println(rentalRecord.customer.customerName + " [" + rentalRecord.customer.getCustomerType() + "] decided to rent out a " + rentalRecord.tool.name + " for "+ rentalRecord.startingDay + " days. Their bill is: $"+ rentalRecord.toolPrice+" \n");
		}

		System.out.println("------------------------Active rental list-----------------------\n");
		for(RentalRecord rentalRecord : BoulderHardware.currentRentalsList){
			System.out.println(rentalRecord.customer.customerName +  " [" + rentalRecord.customer.getCustomerType() + "] still has a " + rentalRecord.tool.name + " for "+ rentalRecord.daysLeftForRental + " days. Their bill is: $"+ rentalRecord.toolPrice+" \n");
		}

		System.out.println("The total money our store made today: $" + BoulderHardware.profit);
	}
}
