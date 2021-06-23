import java.util.Scanner;

public class _1214_이달은며칠까지있을까 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int year = stdIn.nextInt();
		int month = stdIn.nextInt();
		int date = 0;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			if (month == 2)
				date = 29;
		} else {
			if (month == 4 || month == 6 || month == 9 || month == 11)
				date = 30;
			else if (month == 2) {
				date = 28;
			} else
				date = 31;
		}

		System.out.println(date);
	}
}
