class InsufficientFundsException extends Exception{
	private double amount;
	public InsufficientFundsException(String message) {
		super(message);
	}
	public InsufficientFundsException(String message,double amount) {
		super(message);
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}
}
class BankAccount{
	private double balance=100.0;
	public void withdraw(double amt)throws InsufficientFundsException{
		if (amt>balance) 
			throw new InsufficientFundsException("Not enough funds",amt);
		balance-=amt;
	}
}
public class AccountDemo1 {

	public static void main(String[] args) {
	BankAccount account = new BankAccount();
	try {
		account.withdraw(2000);
	}catch(InsufficientFundsException e) {
		System.out.printf("Need %.2f more \n",(e.getAmount()-100));
		System.out.println(e.getMessage());
	}

	}

}
