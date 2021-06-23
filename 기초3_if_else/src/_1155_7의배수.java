import java.util.Scanner;

public class _1155_7의배수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a % 7 == 0)
			System.out.println("multiple");
		else
			System.out.println("not multiple");
	}
}
