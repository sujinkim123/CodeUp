import java.util.Scanner;

public class _1164_터널통과하기1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int height1 = stdIn.nextInt();
		int height2 = stdIn.nextInt();
		int height3 = stdIn.nextInt();

		if (height1 > 170 && height2 > 170 && height3 > 170)
			System.out.println("PASS");
		else
			System.out.println("CRASH");
	}
}
