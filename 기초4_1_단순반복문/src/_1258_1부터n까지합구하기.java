

import java.util.Scanner;

public class _1258_1부터n까지합구하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
