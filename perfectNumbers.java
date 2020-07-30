
public class perfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(45));
	}

	public static boolean isPerfectNumber(int number) {
		int count = 1;
		int divisor = 0;

		if (number < 1) {
			return  false;
		}

		while (number > count) {
			if (number % count == 0) {
				divisor += count;
				//System.out.println(divisor);
			}
			count++;
		}

		if (divisor == number) {
			return true;
		}

		return false;

	}

}
