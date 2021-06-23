import java.util.Scanner;

public class _1158_특별한공던지기2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if ((a >= 30 && a <= 40) || (a >= 60 && a <= 70))
			System.out.println("win");
		else
			System.out.println("lose");
	}
}
