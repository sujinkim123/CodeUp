

import java.util.Scanner;

public class _1354_삼각형출력하기2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*
 * n = 3
 * i=1 j=3
 * i=2 j=2
 * i=3 j=1
*/