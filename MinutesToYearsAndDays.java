
public class MinutesToYearsAndDays {

	public static void main(String[] args) {
		printYearsAndDays(22500);

	}

	public static void printYearsAndDays(long minutes) {
		long days = 0, years = 0;
		if (minutes > 0) {
			System.out.print(minutes + " min = ");
			if (minutes < 60) {
				minutes = minutes;
			}
			if (minutes >= 1440 && minutes < 525600) {

				days = minutes / 1440;
				minutes %= 1440;
			} else {
				years = minutes / 525600;
				minutes %= 525600;
				days = minutes / 1440;
				minutes %= 1440;
			}

			System.out.println(years + " y and " + days + " d");
		}
		if (minutes < 0) {
			System.out.println("error");
		}
	}

}
