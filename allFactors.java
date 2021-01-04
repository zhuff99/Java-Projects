
public class allFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactors(99);
	}

	public static void printFactors(int number) {
		int factors = 0;
		if (number < 1) {
			System.out.println("Invalid Value");
		}

		// System.out.print("print ");

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				System.out.print(i);
				System.out.print(" ");
			}

		}

	}
}
