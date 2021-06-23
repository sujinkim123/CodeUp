import java.util.Scanner;

public class _1167_두번째수 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		if (a <= c && a <= b) { // a가 제일 작은 경우
			if (b <= c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} else if (b <= c && b <= a) { // b가 제일 작은 경우
			if (a <= c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else { // c가 제일 작은 경우
			if (a <= b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}
}
