import java.util.Scanner;

public class _1442_선택정렬 {
	public static void main(String[] args) {
		
		// 배열 크기 n 입력
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		// 배열 선언
		int[] arr = new int[n];
		
		// 배열 arr에 값 대입
		for (int i=0; i<arr.length; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		// 선택정렬(오름차순)
		for (int i=0; i<arr.length; i++) { // 비교 첫번째 수
			for (int j=i+1; j<arr.length; j++) { // 비교 두번째 수
				// 숫자 비교해서 교환
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 출력
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
