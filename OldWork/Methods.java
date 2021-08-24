
public class Methods {

	public static void main(String[] args) {

		int highScore = calculateScore(true, 500, 10, 50);
		System.out.println("Your final score was: " + highScore);
		
		highScore = calculateScore(true, 50220, 1023, 5022);
		System.out.println("Your final score was: " + highScore);

	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1; // if gameOver is not equal to true
					// -1 is used if value is not found

	}

}
