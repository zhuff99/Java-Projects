
public class forLoopPractice {

	public static void main(String[] args) {
		int interestRate = 8;
		// for (int i = 1; i <= 8; i++) {
		// System.out.println(String.format("%.2f", calculateInterest(10000,
		// interestRate)));
		// interestRate--;

	//	System.out.println(isPrime(97));

		int count = 0;

		for (int i = 10; i < 50; i++) {		//while condition is true loops continues to execute
			if (isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");

				if (count == 10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}

	}

	public static double calculateInterest(double amount, double interestRate) {

		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			//System.out.println("Looping " + i);
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}
	
	

}
