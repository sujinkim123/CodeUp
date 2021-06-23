import java.util.Scanner;

public class _1159_특별한공던지기3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int place = stdIn.nextInt();

		if ((place >= 50 && place <= 70) || place % 6 == 0)
			System.out.println("win");
		else
			System.out.println("lose");
	}
}
