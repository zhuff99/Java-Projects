import java.math.*;

public class AreaCalulatorExercise {

	public static void main(String[] args) {
		System.out.println(area(-1));

	}

	public static double area(double radius) {
		double area = 0;
		if (radius < 0) {
			return -1.0;
		}

		area = Math.PI * Math.pow(radius, 2);

		return area;

	}

	public static double area(double x, double y) {

		if (x < 0 || y < 0) {
			return -1.0;
		}

		double area = x * y;
		return area;
	}

}
