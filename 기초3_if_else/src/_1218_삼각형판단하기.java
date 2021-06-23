import java.util.Scanner;

public class _1218_삼각형판단하기 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		if (!(a < b + c && b < a + c && c < a + b))
			System.out.println("삼각형아님");

		else if (a == b && b == c && a == c)
			System.out.println("정삼각형");

		else if (a == b || b == c || a == c)
			System.out.println("이등변삼각형");

		else if (a * a + b * b == c * c)
			System.out.println("직각삼각형");

		else
			System.out.println("삼각형");
	}
}
