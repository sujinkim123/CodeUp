import java.util.Scanner;

public class _1210_칼로리계산하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a + b >= 6) {
			System.out.println("no angry");
		} else if ((a == 1 && b == 4) || (a == 4 && b == 1)) {
			System.out.println("no angry");
		} else if ((a == 2 && b == 3) || (a == 3 && b == 2)) {
			System.out.println("angry");
		} else {
			System.out.println("angry");
		}
	}
}
