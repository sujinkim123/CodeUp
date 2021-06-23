import java.util.Scanner;

public class _1171_당신의학번은2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int grade = stdIn.nextInt();
		int clss = stdIn.nextInt();
		int num = stdIn.nextInt();

		System.out.printf("%d%02d%03d", grade, clss, num);
	}
}
