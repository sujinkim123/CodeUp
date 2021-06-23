

import java.util.Scanner;

public class _1402_거꾸로출력하기3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		for (int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
