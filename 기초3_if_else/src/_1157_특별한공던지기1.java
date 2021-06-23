import java.util.Scanner;

public class _1157_특별한공던지기1 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		double a = stdIn.nextDouble();

		if (a >= 50 && a <= 60)
			System.out.println("win");
		else
			System.out.println("lose");
	}
}
