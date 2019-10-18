package Customers;

public abstract class Customer {

	// Variables
	public String customerName;
	public String customerType;
	public int rentalDaysPerCustomer;

	// Methods
	public String getCustomerType(){
		return this.customerType;
	} // Return tool type
}
