
public class OperatorChallange {
	public static void main(String[] args) {

		double myFirst = 20.00d;
		double mySecond = 80.00d;

		double myAnswer = (myFirst + mySecond) * 100.00d;
		System.out.println(+myAnswer);
		myAnswer = myAnswer % 40.00;

		boolean isNoRemainder = (myAnswer == 0) ? true : false;

		System.out.println(isNoRemainder);
		System.out.println(+myAnswer);

		if (!isNoRemainder) {	//if isNoRemainder == false

			System.out.println("Got some remainder: " + myAnswer);

		}

	}
}
