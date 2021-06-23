

import java.util.Scanner;

public class _1280_홀수는더하고짝수는빼고2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int odd = 0;
		int even = 0;
		
		for (int i=a; i<=b; i++) {
			if (i%2!=0) {
				System.out.print("+"+i);
				odd+=i;
			} else {
				System.out.print(-i);
				even-=i;
			}
		}
		System.out.print("="+(odd+even));
	}
}
