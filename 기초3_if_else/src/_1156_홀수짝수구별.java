import java.util.Scanner;

public class _1156_홀수짝수구별 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a % 2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");
	}
}
