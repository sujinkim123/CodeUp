import java.util.Scanner;

public class _1153_두수의대소비교 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if (a > b)
			System.out.println(">");
		else if (a == b)
			System.out.println("=");
		else
			System.out.println("<");
	}
}
