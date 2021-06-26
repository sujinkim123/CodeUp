import java.util.Scanner;

public class _1206_배수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if (b%a==0) {
			System.out.printf("%d*%d=%d",a,b/a,b);
		} else if (a%b==0) {
			System.out.printf("%d*%d=%d", b,a/b,a);
		} else {
			System.out.println("none");
		}
	}
}
