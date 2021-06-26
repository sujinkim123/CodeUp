import java.util.Scanner;

public class _1281_홀수는더하고짝수는빼고3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int sum = 0;
		
		for (int i=a; i<=b; i++) {
			if (i%2==0) {
				sum -= i;
				System.out.print("-"+i);
			} else {
				sum += i;
				if (i==a) {
					System.out.print(i);
				} else {
					System.out.print("+"+i);
				}
			}
		}
System.out.println("="+sum);
	}
}
