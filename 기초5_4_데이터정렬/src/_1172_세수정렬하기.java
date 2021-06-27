import java.util.Scanner;

public class _1172_세수정렬하기 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if (a<=b) {
			if (b<=c) {
				System.out.printf("%d %d %d", a, b, c);
			} else if (a<=c){
				System.out.printf("%d %d %d", a, c, b);
			} else {
				System.out.printf("%d %d %d", c, a, b);
			}
		} else if (a<=c) {
			System.out.printf("%d %d %d", b, a, c);
		} else if (b<=c) {
			System.out.printf("%d %d %d", b, c, a);
		} else {
			System.out.printf("%d %d %d", c, b, a);
		}
	}
}
