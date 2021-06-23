

import java.util.Scanner;

public class _1409_기억력테스트1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int arr[] = new int[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		int k = stdIn.nextInt();
		
		System.out.println(arr[k-1]);
	}
}
