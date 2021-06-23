

import java.util.Scanner;

public class _1279_홀수는더하고짝수는빼고1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int odd=0;
		int even=0;
		
		for (int i=a; i<=b; i++) {
			if (i%2!=0) {
				odd+=i;
			} else {
				even-=i;
			}
		}
		
		System.out.println(odd+even);
	}
}
