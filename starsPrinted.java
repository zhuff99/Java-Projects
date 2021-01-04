
public class starsPrinted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(5);
	}

	public static void printSquareStar(int n) {
		int count = 0;
		String full = "";
		String everyOther = "";
		String space = "";
		
		while (count < n) {
			full += "*";
			count++;
			
			if(n % 2 == 0) {
				everyOther += " ";
			}
			
			if(n % 2 != 0) {
				everyOther += "*";
			}

			if (count <= n - 4) {
				space += " ";
			}
		}
		
		if (n % 2 != 0) {
			System.out.println(full);
			System.out.println("**" + space + "**");
			System.out.println(everyOther);
			System.out.println("**" + space + "**");
			System.out.println(everyOther);
		} else {

		}
	}

}
