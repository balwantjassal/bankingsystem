package bankingproject;

public class RBIClass {
	private String bankName;
	private String ifscCode;
	private String location;
	protected double rate_of_interest;
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
	
	
}
