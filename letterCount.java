import java.util.*;
import java.io.*;

public class letterCount {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in).useDelimiter("\\n");
		Scanner number = new Scanner(System.in);

		File file = new File("test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String text = "";
		int num;
		int lower = 0, space = 0, upper = 0, nums = 0, max = 0, numm = 0;

		System.out.println("Do you want to enter your own text or read from a file? ");
		System.out.println("Enter [1] for input: ");
		System.out.println("Enter [2] for file: ");
		num = number.nextInt();

		if (num == 1) {
			System.out.println("Enter your text: ");
			text = input.nextLine();
		}

		if (num == 2) {
			System.out.println("Reading From file...... ");
			while (br.readLine() != null) {
				text += br.readLine();
			}
		}

		if (text.isBlank()) {
			System.out.println();
		}

		for (int i = 0; i < text.length(); i++) {

			if (Character.isUpperCase(text.charAt(i))) { // counts letters uppercase or lowercase
				upper++;

			}

			if (Character.isSpaceChar(text.charAt(i))) { // counts number of spaces in provided text

				space++;
			}

			if (Character.isLowerCase(text.charAt(i))) {
				lower++;
			}

			if (Character.isDigit(text.charAt(i))) {
				nums++;

			}
			if (Character.isJavaIdentifierPart(text.charAt(i))) {
				max++;
			}

		}

		System.out.println("\n\n");
		System.out.println("Number of lowercase letters: " + lower);
		System.out.println("Number of Uppercase letters: " + upper);
		System.out.println("Number of Digits: " + nums);
		System.out.println("Number of spaces:          " + space);

		System.out.println("Total number: " + max + "   " + num);

		input.close();
		number.close();

	}

}
