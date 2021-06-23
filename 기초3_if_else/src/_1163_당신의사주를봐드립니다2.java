import java.util.Scanner;

public class _1163_당신의사주를봐드립니다2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int year = stdIn.nextInt();
		int month = stdIn.nextInt();
		int date = stdIn.nextInt();

		if ((year - month + date) % 10 == 0)
			System.out.println("대박");
		else
			System.out.println("그럭저럭");
	}
}
