

import java.util.Scanner;

public class _1352_사각형출력하기1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
