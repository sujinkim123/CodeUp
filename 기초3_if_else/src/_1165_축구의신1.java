import java.util.Scanner;

public class _1165_축구의신1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int playtime = stdIn.nextInt();
		int score = stdIn.nextInt();
		int result = 0;

		if (playtime % 5 != 0)
			result = (90 - playtime) / 5 + 1 + score;
		else
			result = (90 - playtime) / 5 + score;

		System.out.println(result);
	}
}
