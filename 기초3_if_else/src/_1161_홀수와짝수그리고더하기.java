import java.util.Scanner;

public class _1161_홀수와짝수그리고더하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a % 2 == 0) {
			if (b % 2 == 0) {
				System.out.println("짝수+짝수=짝수");
			} else {
				System.out.println("짝수+홀수=홀수");
			}
		} else {
			if (b % 2 == 0) {
				System.out.println("홀수+짝수=홀수");
			} else {
				System.out.println("홀수+홀수=짝수");
			}
		}
	}
}
