import java.util.Scanner;

public class _1403_배열두번출력하기 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int k = stdIn.nextInt();
		int[] arr = new int[k];
		
		for (int i=0; i<k; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
	}
}
