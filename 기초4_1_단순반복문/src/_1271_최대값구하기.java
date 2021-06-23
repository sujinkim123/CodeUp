

import java.util.Scanner;

public class _1271_최대값구하기 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		
		for(int i=0; i<n; i++) {
			arr[i] = stdIn.nextInt();
			if (arr[i]>=max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
