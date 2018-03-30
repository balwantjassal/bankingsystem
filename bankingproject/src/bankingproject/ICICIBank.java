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
	/*@ Overriding Concept
	public void setWithdrawlLimit(double amtlimit) {
		 if(amtlimit > 150000) {
			 System.out.println("Your Bank not authorized with more than Rs 50000 withdrawl limit");
		 }else {
			this.amtlimit = amtlimit;
		 }
		
	}*/
	public void withDrawlLimit() {
		if(amtlimit < 1.0) {
			System.out.println("Withdrawl limit not set for ICIC bank");
		}else {
		System.out.println("Rs " + amtlimit +"/-per day to all ICICI Customers...");
	
		}
	}
}
