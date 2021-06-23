import java.util.Scanner;

public class _1212_삼각형의성립조건 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("yes");
		} else
			System.out.println("no");
	}
}
