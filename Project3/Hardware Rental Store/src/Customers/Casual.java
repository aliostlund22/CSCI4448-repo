package Customers;

public class Casual extends Customer {

	// Constructor
	Casual(String type, String name) {
		this.customerType = type;
		this.customerName = name;
		this.rentalDaysPerCustomer = 2;
	}

}
