class Account{
	int accountNo;
	String accountType;
	int accountBalance;
	void setAccountDetails(int accountNo,String accountType,int accountBalance) {
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void withdraw(int amount) {
		this.accountBalance-=amount;
	}
	void deposit(int amount) {
		this.accountBalance+=amount;
	}
	void dispAccountDetails() {
		System.out.print("Account Number: "+accountNo+"\nAccount Type: "+accountType+"\nAccount Balance: "+accountBalance);
	}
}
public class AccountDemo {
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccountDetails(4257234, "savings", 300000000);
		ac.withdraw(900000000);
		ac.deposit(9000);
		ac.dispAccountDetails();
	}

}