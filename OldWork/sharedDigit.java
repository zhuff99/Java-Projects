
public class sharedDigit {

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 90));
		System.out.println(hasSharedDigit(15, 55));
		System.out.println(hasSharedDigit(12, 93));
		System.out.println(hasSharedDigit(77, 17));

	}

	public static boolean hasSharedDigit(int num1, int num2) {
		int lastFirst = 0;
		int lastSecond = 0;
		int firstNum = 0;
		int secondNum = 0;

		if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
			return false;

		}

		lastFirst = num1 % 10;
		lastSecond = num2 % 10;

		num1 /= 10;
		num2 /= 10;

		firstNum = num1 % 10;
		secondNum = num2 % 10;

		if (firstNum == secondNum || firstNum == lastSecond || secondNum == lastFirst || lastFirst == lastSecond) {
			return true;
		}

		return false;
	}
}