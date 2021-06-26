import java.util.Scanner;

public class _1273_약수구하기 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				System.out.print(i + " ");
			}
		}
	}
}
