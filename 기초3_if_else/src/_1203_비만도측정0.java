import java.util.Scanner;

public class _1203_비만도측정0 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int BMI = stdIn.nextInt();

		if (BMI <= 10) {
			System.out.println("정상");
		} else if (BMI <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}
}
