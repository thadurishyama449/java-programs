
class Accounts {

    int accountNo;
    String accountType;
    int accountBalance;

    // Constructor
    Accounts(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void withdraw(int amount) {
        if (accountBalance > amount)
            this.accountBalance -= amount;
        else
            System.out.println("Insufficient Balance!!");
    }

    void deposit(int amount) {
        this.accountBalance += amount;
    }

    void dispAccountDetails() {
        System.out.println("Account no: " + accountNo +
                           " Account Type: " + accountType +
                           " Balance: " + accountBalance);
    }
}
public class AccountConstructor {
	 public static void main(String[] args) {

	        // Calling constructor instead of setAccountDetails()
	        Accounts a1 = new Accounts(123456, "SB", 10000);

	        a1.dispAccountDetails();
	        a1.deposit(1000);
	        a1.dispAccountDetails();
	        a1.withdraw(15000);
	        a1.dispAccountDetails();
	        a1.withdraw(5000);
	        a1.dispAccountDetails();
	    }
}