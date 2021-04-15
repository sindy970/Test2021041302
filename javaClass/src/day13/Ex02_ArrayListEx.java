package day13;

import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		// ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고 모두 출력하고 가장 긴 단어 출력하기
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		String temp1 = "", max = "";

		for (int i = 0; i < 5; i++) {
			System.out.print("단어를 입력하세요 : ");
			String num = sc.next();
			list.add(num);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			temp1 = list.get(i);

			// String 변수도 length()메소드를 이용하여 문자열의 크기(길이)를 알수 있다.
			if (temp1.length() > max.length()) {
				max = temp1;
			}
		}
		System.out.println("가장 긴 단어는 : " + max);

	}

}
