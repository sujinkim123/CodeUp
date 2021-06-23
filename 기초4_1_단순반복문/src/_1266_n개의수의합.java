

import java.util.Scanner;

public class _1266_n개의수의합 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		
		for (int i=0;i<n;i++) {
			arr[i] = stdIn.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
