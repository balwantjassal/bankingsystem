package bankingproject;

public class RBIClass {
	private String bankName;
	private String ifscCode;
	private String location;
	protected double rate_of_interest;
	protected double amtlimit;
	static int count = 0;
	
	public RBIClass(String bankName,String location) {
		super();
		this.bankName = bankName;
		++count;
		ifscCode = "000" + count;
		this.ifscCode = bankName +ifscCode;
		this.location = location;
	}


	
	public void showBankDetails() {
		System.out.println("***********************XXX*************************");
		System.out.println("Bank Name :" + bankName);
		System.out.println("IFSC CODE :" + ifscCode);
		System.out.println("location : " + location);
		System.out.println("Rate of Interest : " + rate_of_interest);
		System.out.println("**********************XXX*************************");
	}
	
	public final void setWithdrawlLimit(double amtlimit)throws UserLimitException  {
		// Code Dated 4th April 2018
		if(amtlimit > 50000) {
			throw(new UserLimitException(100));
		}
		/* if(amtlimit > 50000) {
			 System.out.println("Your Bank not authorized with more than Rs 50000 withdrawl limit");
		 }else {
			this.amtlimit = amtlimit;
		 }
		 */
		/*if(amtlimit > 50000) {
			throw new Exception("Trying to SET Wrong Limit");
		}*/
		/*try {
			if(amtlimit > 50000) {
				throw new Exception("Trying to SET Wrong Limit");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		
		
	}
	
	
}
