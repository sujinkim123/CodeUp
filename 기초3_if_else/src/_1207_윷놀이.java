import java.util.Scanner;

public class _1207_윷놀이 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int yoot1 = stdIn.nextInt();
		int yoot2 = stdIn.nextInt();
		int yoot3 = stdIn.nextInt();
		int yoot4 = stdIn.nextInt();
		int sum = yoot1 + yoot2 + yoot3 + yoot4;

		if (sum == 0) {
			System.out.println("모");
		} else if (sum == 1) {
			System.out.println("도");
		} else if (sum == 2) {
			System.out.println("개");
		} else if (sum == 3) {
			System.out.println("걸");
		} else if (sum == 4) {
			System.out.println("윷");
		}
	}
}
