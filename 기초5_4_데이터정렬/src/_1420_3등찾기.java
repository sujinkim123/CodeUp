import java.util.Scanner;

class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class _1420_3등찾기 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Student student[] = new Student[n];
		int max = 0;
		int second = 0;
		int third = 0;
		
		for (int i=0; i<student.length; i++) {
			student[i] = new Student(stdIn.next(), stdIn.nextInt());
			max = (student[i].score > max) ? student[i].score : max;
		}
		
		for (int i=0; i<student.length; i++) {
			if (student[i].score == max)
				continue;
			second = (student[i].score > second) ? student[i].score : second;
		}
		
		for (int i=0; i<student.length; i++) {
			if (student[i].score == max || student[i].score == second)
				continue;
			third = (student[i].score > third) ? student[i].score : third;
		}
		
		for (int i=0; i<student.length; i++) {
			if (student[i].score == third) {
				System.out.print(student[i].name);
				return;
			}
		}
	}
}
