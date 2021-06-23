

import java.util.Scanner;

public class _1277_몇번째데이터출력하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		System.out.print(arr[0] + " " + arr[(n - 1) / 2] + " " + arr[n - 1]);

	}
}
