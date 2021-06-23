

import java.util.Scanner;

public class _1253_a부터b까지출력하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a <= b) {
			for (int i = a; i <= b; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			for (int i=b; i<=a; i++) {
				System.out.printf("%d ", i);
			}
		}
	}
}
