import java.util.Arrays;
import java.util.Scanner;

public class _1451_데이터정렬small {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		Arrays.sort(arr); // 올림차순 정렬
		
		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
