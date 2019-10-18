package Customers;

public class Regular extends Customer {

	// Constructor
	Regular(String type, String name) {
		this.customerType = type;
		this.customerName = name;
		this.rentalDaysPerCustomer = 2;
	}

}
