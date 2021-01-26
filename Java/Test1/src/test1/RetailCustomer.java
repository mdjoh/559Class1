package test1;

public class RetailCustomer implements Customer {

	@Override
	public void displayCustomer(String name, String address, int customerID) {
		
		System.out.print("The customer is " + name + ". They live at " + address + ". Their ID number is " + customerID + ".");
		
	}
	
}
