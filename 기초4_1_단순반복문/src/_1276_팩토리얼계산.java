

import java.util.Scanner;

public class _1276_팩토리얼계산 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int fac = 1;
		for (int i=n; i>=1; i--) {
			fac *= i;
		}
		System.out.println(fac);
	}
}
