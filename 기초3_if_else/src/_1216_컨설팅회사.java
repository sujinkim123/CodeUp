import java.util.Scanner;

public class _1216_컨설팅회사 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = b - c;

		if (a > d) {
			System.out.println("do not advertise");
		} else if (a < d) {
			System.out.println("advertise");
		} else {
			System.out.println("does not matter");
		}
	}
}
