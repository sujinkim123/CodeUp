

import java.util.Scanner;

public class _1252_1부터n까지출력하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("%d ", i);
		}
	}
}
