import java.util.Scanner;

public class _1180_만능휴지통 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int result = ((n % 10) * 10 + n / 10) * 2;

		if (result >= 100) {
			result -= 100;
		}

		if (result > 50) {
			System.out.println(result);
			System.out.println("OH MY GOD");
		} else {
			System.out.println(result);
			System.out.println("GOOD");
		}
	}
}
