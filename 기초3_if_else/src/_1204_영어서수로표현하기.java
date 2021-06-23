import java.util.Scanner;

public class _1204_영어서수로표현하기 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		if (n == 11 || n == 12 || n == 13) {
			System.out.println(n + "th");
		} else if (n % 10 == 1) {
			System.out.println(n + "st");
		} else if (n % 10 == 2) {
			System.out.println(n + "nd");
		} else if (n % 10 == 3) {
			System.out.println(n + "rd");
		} else {
			System.out.println(n + "th");
		}
	}
}
