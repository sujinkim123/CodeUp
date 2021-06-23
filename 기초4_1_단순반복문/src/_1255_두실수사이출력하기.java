

import java.util.Scanner;

public class _1255_두실수사이출력하기 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		double a = stdIn.nextDouble();
		double b = stdIn.nextDouble();
		
		for (double i=a; i<=b; i+=0.01) {
			System.out.printf("%.2f ",i);
		}
	}
}
