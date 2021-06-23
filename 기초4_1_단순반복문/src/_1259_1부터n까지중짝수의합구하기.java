

import java.util.Scanner;

public class _1259_1부터n까지중짝수의합구하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			if (i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
