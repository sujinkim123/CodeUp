import java.util.Scanner;

public class _1166_윤년판별 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int year = stdIn.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("yes");
		} else if (year % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
