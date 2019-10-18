package Customers;

public class Business extends Customer{

	// Constructor
	Business(String type, String name) {
		this.customerType = type;
		this.customerName = name;
		this.rentalDaysPerCustomer = 3;
	}
}
