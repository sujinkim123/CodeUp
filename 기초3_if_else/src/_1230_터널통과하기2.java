import java.util.Scanner;

public class _1230_터널통과하기2 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int car = 170;
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		if (a > car && b > car && c > car) {
			System.out.println("PASS");
		} else if (a <= car) {
			System.out.println("CRASH " + a);
		} else if (b <= car) {
			System.out.println("CRASH " + b);
		} else {
			System.out.println("CRASH " + c);
		}
	}
}
