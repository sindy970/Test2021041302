package day13;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// Cal클래스를 이용하는 main클래스
		// 계산기 프로그램
		Scanner sc = new Scanner(System.in);
		// 객체 선언
		Cal cal = new Cal();
		int cho = 0, one, two;
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("--------------------------------------");

			System.out.print("선택> ");
			cho = sc.nextInt();

			switch (cho) {
			case 1:
				System.out.print("숫자 2개를 입력하세요 : ");
				one = sc.nextInt();
				two = sc.nextInt();
				cal.add(one, two);
				break;

			case 2:
				System.out.print("숫자 2개를 입력하세요 : ");
				one = sc.nextInt();
				two = sc.nextInt();
				cal.minus(one, two);
				break;

			case 3:
				System.out.print("숫자 2개를 입력하세요 : ");
				one = sc.nextInt();
				two = sc.nextInt();
				int tim2 = cal.times(one, two);
				System.out.println(tim2);
				break;

			case 4:
				int div2 = cal.divide();
				System.out.println(div2);
				break;

			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
