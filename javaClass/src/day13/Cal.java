package day13;

import java.util.Scanner;

public class Cal {

	// 덧셈용 메소드(sum)
	// 더하는 수를 매개값으로 받아서 덧셈 결과 출력
	void add(int one, int two) {
		int sum = one + two;
		System.out.println(sum);
	}

	// 뺄셈용 메소드(sub)
	// main클래스에서 숫자2개를 입력받아 입력받은 값을 매개값으로 받아서 결과 출력
	void minus(int one, int two) {
		int minu = one - two;
		System.out.println(minu);
	}

	// 곱셈용 메소드(mul)
	// main클래스에서 숫자 2개를 입력받아 입력받은 값을 매개값으로 전달 받고 결과 리턴
	int times(int one, int two) {
		int tim = one * two;
		return tim;
	}

	// 나눗셉용 메소드(div)
	// main클래스에서 호출만하고 cal클래스에서 스캐너로 입력받고 결과 리턴
	int divide() {
		int one, two;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하세요 : ");
		one = sc.nextInt();
		two = sc.nextInt();

		int div = one / two;
		return div;
	}
}
