

import java.util.Scanner;

public class _1270_1의개수는 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int count=0;
		
		for (int i=1; i<=n; i++) {
			if (i%10==1)
				count++;
		}
		System.out.println(count);
	}
}
