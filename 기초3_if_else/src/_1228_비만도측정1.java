import java.util.Scanner;

public class _1228_비만도측정1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double height = stdIn.nextDouble();
		double weight = stdIn.nextDouble();
		int normal_height = (int) ((height - 100) * 0.9);
		double BMI = (weight - normal_height) * 100 / normal_height;

		if (BMI <= 10) {
			System.out.println("정상");
		} else if (BMI <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}
}
