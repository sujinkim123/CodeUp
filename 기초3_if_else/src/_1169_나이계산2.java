import java.util.Scanner;

public class _1169_나이계산2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int age = stdIn.nextInt();

		if (age <= 13) {
			if (13 - age < 10) { // 출생년도 뒤 2자리가 10보다 작을 경우
				System.out.printf("%d 3", (2013 - age) % 2000);
			} else {
				System.out.printf("%d 3", (2013 - age) % 2000);
			}
		} else {
			if (age <= 112 && age >= 103) { // 출생년도 뒤 2자리가 10보다 작을 경우
				System.out.printf("%d 1", (2013 - age) % 1900);
			} else {
				System.out.printf("%d 1", (2013 - age) % 1900);
			}
		}
	}
}
