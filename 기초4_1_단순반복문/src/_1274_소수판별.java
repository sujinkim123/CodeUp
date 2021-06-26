import java.util.Scanner;

public class _1274_소수판별 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int count = 0;
		
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				count = count + 1;
			}
		}
		if (count==2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
