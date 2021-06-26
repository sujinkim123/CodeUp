import java.util.Scanner;

public class _1275_k제곱구하기 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int result = 1;
		
		for (int i=0; i<k; i++) {
			result = result * n; 
		}
		System.out.println(result);
	}
}
