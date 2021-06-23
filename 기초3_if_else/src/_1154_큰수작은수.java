import java.util.Scanner;

public class _1154_큰수작은수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if (a > b)
			System.out.println(a - b);
		else
			System.out.println(b - a);
	}
}
