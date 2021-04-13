package day11;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		// 학생 관리 및 점수 입력 프로그램
		Scanner sc = new Scanner(System.in);
		int[] student = null;
		int cho = 0, stu = 0;
		int max = 0;
		double avg = 0;
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			cho = sc.nextInt();

			switch (cho) {
			
			case 1:
				System.out.print("학생수> ");
				stu = sc.nextInt();
				student = new int[stu];
				break;
				
			case 2:
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번째 학생 점수 : ");
					student[i] = sc.nextInt();
				} // for
				break;
				
			case 3:
				for (int i = 0; i < student.length; i++) {
					System.out.println((i + 1) + "번째 학생 점수 : " + student[i]);
				} // for
				break;
				
			case 4:
				for (int i = 0; i < student.length; i++) {
					if (student[i] > max) {
						max = student[i];
					} // if
					avg = avg + student[i];
				} // for
				for (int i = 0; i < student.length; i++) {
					for (int j = i + 1; j < student.length; j++) {
						int temp = 0;
						if (student[i] < student[j]) {
							temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						} // if
					} // for
				} // for
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (avg / stu));
				for (int i = 0; i < student.length; i++) {
					System.out.println(student[i]);
				} // for
				break;
				
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
