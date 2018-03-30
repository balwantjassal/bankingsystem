package bankingproject;

public class BankBranches {
	public static void main(String[] args){
		SBIBank sbiBank1 = new SBIBank("SBI","LPU");
		SBIBank sbiBank2 = new SBIBank("SBI","Jalandhar");
		ICICIBank icicBank1 = new ICICIBank("ICICI","Lovely Professional University");
		ICICIBank icicBank2 = new ICICIBank("ICICI","Ludhiana Agar Nagar");
		/*sbiBank1.showBankDetails();
		sbiBank2.showBankDetails();
		icicBank1.showBankDetails();
		icicBank2.showBankDetails();*/
		// Demo of Polymorphism
		/*RBIClass rbi = sbiBank1;
		rbi.showBankDetails();
		rbi = icicBank2;
		rbi.showBankDetails();
		*/
		try {
		sbiBank1.setWithdrawlLimit(50000.0);
		icicBank1.setWithdrawlLimit(100000.0);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		sbiBank1.withDrawlLimit();
		icicBank1.withDrawlLimit();
	}

}
