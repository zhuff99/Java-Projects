
public class isLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isLeap = isLeapYears(1600);
		System.out.println(isLeap);

		System.out.println("*********************");
		System.out.println(getDaysInMonth(2, 2020));
	}

	public static boolean isLeapYears(int year) {

		if (year > 0 && year < 9999) {
			if (year % 4 == 0 && year % 100 != 0) {
				return true;
			}

			else if (year % 400 == 0) {
				return true;
			}

		}
		return false;
	}

	public static int getDaysInMonth(int month, int year) {

		if (month < 1 || month > 12) {
			return -1;
		}
		if (year < 1 || year > 9999) {
			return -1;
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 2) {
			if (isLeapYears(year) == true) {
				return 29;
			} else {
				return 28;
			}
		}

		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}

		return -1;
	}

}
