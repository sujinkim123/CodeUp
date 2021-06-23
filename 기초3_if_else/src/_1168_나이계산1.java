import java.util.Scanner;

public class _1168_나이계산1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int birth = stdIn.nextInt();
		int info = stdIn.nextInt();

		if (info == 1 || info == 2) {
			System.out.printf("%d", 2012 - (1900 + birth / 10000) + 1);
		} else {
			System.out.printf("%d", 2012 - (2000 + birth / 10000) + 1);
		}
	}
}
