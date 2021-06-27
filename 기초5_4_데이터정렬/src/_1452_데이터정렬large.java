import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _1452_데이터정렬large {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Integer[] arr = new Integer[n];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
