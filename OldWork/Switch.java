
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;

		switch (value) { // can use byte, short, char, and int...added string in later version

		case 1:
			System.out.println("Number is 1");
			break;
		case 2:
			System.out.println("Number is 2");
			break;
		default:
			System.out.println("Was not 1 or 2");
			break;
		}

		char letter = 'A';
		switch (letter) {
		case 'A':
			System.out.println("The letter A was found");
			break;
		// etc
		// etc
		}

		String myString = "January";
		switch (myString) {
		case "January":
			System.out.println("jan");
			break;

		}
		printNumberInWord(1);
	}

	public static void printNumberInWord(int number) {

		
		if (number == 0) {
			System.out.println("ZERO");
		}
		else if (number == 1) {
			System.out.println("ONE");
		}
		else if (number == 2) {
			System.out.println("TWO");
		}
		else if (number == 3) {
			System.out.println("THREE");
		}
		else if (number == 4) {
			System.out.println("FOUR");
		}
		else if (number == 5) {
			System.out.println("FIVE");
		}
		else if (number == 6) {
			System.out.println("SIX");
		}
		else if (number == 7) {
			System.out.println("SEVEN");
		}
		else if (number == 8) {
			System.out.println("EIGHT");
		}
		else if (number == 9) {
			System.out.println("NINE");
		} else {
			System.out.println("OTHER");
		}

	}
}