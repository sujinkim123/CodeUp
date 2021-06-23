

import java.util.Scanner;

public class _1260_3의배수의합 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int sum = 0;
		
		for (int i=a; i<=b; i++) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
