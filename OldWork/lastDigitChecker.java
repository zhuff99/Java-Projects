
public class lastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
		System.out.println(hasSameLastDigit(22, 23, 34));
		System.out.println(isValid(10));
		System.out.println(isValid(468));
		System.out.println(isValid(1051));

	}

	// compares last digit of 3 integers if any are equal then return true

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		int num1Last, num2Last, num3Last = 0;

		if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
			return false;

		}


			num1Last = num1 % 10;
			num2Last = num2 % 10;
			num3Last = num3 % 10;

			if (num1Last == num2Last || num1Last == num3Last || num2Last == num3Last) {

				return true;

			}

		return false;

	}

	public static boolean isValid(int number) {

		if (number >= 10 && number <= 1000) {
			return true;
		}

		return false;
	}

}
