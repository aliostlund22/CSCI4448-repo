package Main;

import Customers.Customer;
import Tools.Tool;

// Creates a unique rental record for each transaction
public class RentalRecord {

	// Variables
	public int daysLeftForRental; // Days left for particular tool rental
	public int startingDay; // Days tool can be rented out based on customer
	public double toolPrice; // Price of tool
	public Customer customer; // Customers.Customer object
	public Tool tool; // Tools.Tool object

	// Constructor: takes in a Customers.Customer, Tools.Tool, Main.RentalRecord Period and Tools.Tool Cost
	public RentalRecord(Customer customer, Tool tool, int startingDay, double toolPrice){
		this.startingDay = startingDay;
		this.daysLeftForRental = this.startingDay;
		this.customer = customer;
		this.toolPrice = toolPrice;
		this.tool = tool;
	}
}
