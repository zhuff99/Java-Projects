
public class Main {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setBalance(1500.0);
		account.deposit(50.00);
		account.withdraw(1500.00);
		account.deposit(344.5);
		System.out.println(account.getBalance());
		
		
		
		
		
//
//		Person person = new Person();
//		person.setFirstName(""); // firstName is set to empty string
//		person.setLastName(""); // lastName is set to empty string
//		person.setAge(10);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setFirstName("John"); // firstName is set to John
//		person.setAge(18);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setLastName("Smith"); // lastName is set to Smith
//		System.out.println("fullName= " + person.getFullName());

	}

}
