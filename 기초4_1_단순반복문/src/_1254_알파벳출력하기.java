

import java.util.Scanner;

public class _1254_알파벳출력하기 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char a = stdIn.next().charAt(0);
		char b = stdIn.next().charAt(0);

		if ((int)a <= (int)b) {
			for (char i = a; i <= b; i++) {
				System.out.print(i+" ");
			}
		} else if (a >= b) {
			for (char i = b; i <= a; i++) {
				System.out.print(i+" ");
			}
		}
	}
}