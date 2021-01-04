import java.util.Scanner;

public class doWhileSWITCH {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String text = "";
		String exit = "exit";

		do {
			System.out.println("Enter a command: ");
			text = scan.nextLine();
			
			switch (text) {
			case "start":
				System.out.println("MaCHINE BOOTING UP");
				break;

			case "stop":
				System.out.println("Machine Shuting down");
				break;

			default:
				System.out.println("Command not recognized");
				break;
			}

		} while (text != exit);
		scan.close();
	}
	
}