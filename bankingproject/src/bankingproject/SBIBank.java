package bankingproject;
import java.util.ArrayList;;

public class SBIBank extends RBIClass implements ROI {
	ArrayList customerList = new ArrayList();

	public SBIBank(String bankName, String location) {
		super(bankName, location);
		rate_of_interest = BASE_RATE + 9.75;
		// TODO Auto-generated constructor stub
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public double roi_Home() {
		return 0.0;
		// Challenge
	}
	public double roi_Car() {
		return 0.0;
		// Challenge
	}
	public void SBIBonus() {
		System.out.println("Rs 200000/- Bonus to all Employees...");
	}
	
	public void withDrawlLimit() {
		System.out.println("Rs " + amtlimit +"/-per day to all SBI Customers...");
	}
	
	public void addCustomer(Customer cust) {
		customerList.add(cust);
	}
	public void withDrawMoney(Customer cust, double amt) throws UserLimitException {
		if(amt > cust.balance) {
			throw(new UserLimitException(300));
		}
		
	}
	
}
