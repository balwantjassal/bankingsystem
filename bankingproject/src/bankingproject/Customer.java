package bankingproject;

public class Customer {
	String name;
	double balance = 0.0;
	public Customer(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public void showCustomer() {
		System.out.println(name);
		System.out.println(balance);
		
	}

}
