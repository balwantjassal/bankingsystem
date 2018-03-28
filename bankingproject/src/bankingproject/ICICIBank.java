package bankingproject;

public class ICICIBank extends RBIClass implements ROI {
	public ICICIBank(String bankName, String location) {
		super(bankName, location);
		rate_of_interest = BASE_RATE + 11.75;
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
	public void withDrawlLimit() {
		System.out.println("Rs 50000/- per day to all Customers...");
	}
}
