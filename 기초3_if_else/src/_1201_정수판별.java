import java.util.Scanner;

public class _1201_정수판별 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();

		if (num > 0)
			System.out.println("양수");

		if (num < 0)
			System.out.println("음수");

		if (num == 0)
			System.out.println("0");
	}
}
