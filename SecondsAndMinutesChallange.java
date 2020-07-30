
public class SecondsAndMinutesChallange {

	public static void main(String[] args) {

		String durationString = getDurationString(139, 59);
		System.out.println(durationString);
		System.out.println("***********************");
		durationString = getDurationString(86400);
		System.out.println(durationString);
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

			String durationString = "";
			String hoursString = "";
			String minutesString = "";
			String secondsString = "";
			int hours = 0;
			if (minutes > 59) {
				hours = minutes / 60;
				minutes %= 60;
			}

			if (hours >= 10) {
				hoursString = hours + "h ";
			} else {
				hoursString = "0" + hours + "h ";
			}

			if (minutes >= 10) {
				minutesString = minutes + "m ";
			} else {
				minutesString = "0" + minutes + "m ";
			}

			if (seconds >= 10) {
				secondsString = seconds + "s ";
			} else {
				secondsString = "0" + seconds + "s ";
			}

			durationString = hoursString + minutesString + secondsString;

			return durationString;

		}

		return "Invalid Value";

	}

	public static String getDurationString(int seconds) {
		int minutes = 0;
		if (seconds >= 0) {
			if (seconds <= 59) {
				minutes = 0;

			}
			if (seconds >= 60) {
				minutes = seconds / 60;
				seconds %= 60;

			}

			return getDurationString(minutes, seconds);

		}

		return "Invalid Value";

	}

}
