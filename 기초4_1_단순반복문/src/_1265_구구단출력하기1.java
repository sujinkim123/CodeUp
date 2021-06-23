

import java.util.Scanner;

public class _1265_구구단출력하기1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int dan = stdIn.nextInt();
		
		for (int i=1; i<=dan; i++) {
			for (int j=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
			}
		}
		System.out.println();
	}
}
