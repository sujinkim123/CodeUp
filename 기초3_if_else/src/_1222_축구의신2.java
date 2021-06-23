import java.util.Scanner;

public class _1222_축구의신2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int time = stdIn.nextInt();
		int score1 = stdIn.nextInt();
		int score2 = stdIn.nextInt();

		if (time % 5 == 0) {
			score1 += (90 - time) / 5;
		} else
			score1 += (90 - time) / 5 + 1;

		if (score1 > score2)
			System.out.println("win");
		else if (score1 == score2)
			System.out.println("same");
		else
			System.out.println("lose");
	}
}
