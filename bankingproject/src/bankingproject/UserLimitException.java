package bankingproject;

public class UserLimitException extends Exception{
	String message;
	int errorCode = 0;

	public UserLimitException(int errorCode) {
		super();
		this.errorCode = errorCode;
		if(errorCode == 100) {
			this.message = "Error: wrong limit set for customer";
		}else if(errorCode == 200) {
			this.message = "Error: Account Deactivated";
		}else if(errorCode == 300) {
			this.message = "Error: Insufficient Balance";
		}else {
			this.message = "success";
		}
	
	}
	
	public String getMessage() {
		
		return message;
	}

}
