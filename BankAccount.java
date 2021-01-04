
public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	private double withDraw;
	private double deposit;
	
	
	public BankAccount() {
		System.out.println("Creating new Account. ");
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}

	public void withdraw(double withDrawAmount) {

		if (this.balance - withDrawAmount < 0) {
			System.out.println("Insufficiant funds");
		} else {
			this.balance -= withDrawAmount;
		}
	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public double getBalance() {

//		if (withDraw > 0) {
//			return balance - withDraw;
//		}
//		if (deposit > 0) {
//			return balance + deposit;
//		}
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
