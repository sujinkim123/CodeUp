

import java.util.Scanner;

public class _1268_n개의수중짝수의개수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] = stdIn.nextInt();
			if (arr[i]%2==0)
				count++;
		}
		System.out.println(count);
 	}
}
