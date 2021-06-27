import java.util.Scanner;

public class _1441_버블정렬 {
	public static void main(String[] args) {

		// 배열의 크기 n 입력
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		// 배열 선언
		int[] arr = new int[n];

		// 배열에 값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stdIn.nextInt();
		}

		// 버블 정렬(오름차순)
		for (int i = 0; i < arr.length - 1; i++) { // 비교 첫번째 수
			for (int j = 0; j < arr.length - 1; j++) { // 비교 두번째 수
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
