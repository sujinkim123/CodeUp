import java.util.Scanner;

public class _1173_30분전 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int hour = stdIn.nextInt();
		int minute = stdIn.nextInt();
		if (hour == 0 && minute >= 30) {
			System.out.printf("%d %d", 0, (minute - 30));
		} else if (hour == 0 && minute < 30) {
			System.out.printf("%d %d", 23, (minute + 30));
		} else if (minute >= 30) {
			System.out.printf("%d %d", hour, (minute - 30));
		} else {
			System.out.printf("%d %d", (hour - 1), (30 + minute));
		}
	}
}
