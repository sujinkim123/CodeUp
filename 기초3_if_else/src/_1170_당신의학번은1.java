import java.util.Scanner;

public class _1170_당신의학번은1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int grade = stdIn.nextInt();
		int clss = stdIn.nextInt();
		int num = stdIn.nextInt();

		if (num < 10) {
			System.out.printf("%d%d%02d", grade, clss, num);
		} else {
			System.out.printf("%d%d%d", grade, clss, num);
		}
	}
}
