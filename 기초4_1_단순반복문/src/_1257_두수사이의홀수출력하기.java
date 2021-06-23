

import java.util.Scanner;

public class _1257_두수사이의홀수출력하기 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a % 2 != 0) {
			for (int i = a; i <= b; i += 2) {
				System.out.print(i+" ");
			}
		} else {
			for (int i=a+1; i<=b; i+=2) {
				System.out.print(i+" ");
			}
		}
	}
}
