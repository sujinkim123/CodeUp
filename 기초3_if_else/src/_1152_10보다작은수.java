import java.util.Scanner;

public class _1152_10보다작은수 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a < 10)
			System.out.println("small");
		else
			System.out.println("big");
	}

}
