import java.util.Arrays;
import java.util.Scanner;

public class _1443_삽입정렬 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = stdIn.nextInt();
		}

//		for (int i = 1; i < arr.length; i++) {
//			temp = arr[i];
//			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
//				arr[j + 1] = arr[j];
//			}
//			arr[j + 1] = temp;
//		}
		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
