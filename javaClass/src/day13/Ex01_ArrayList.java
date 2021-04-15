package day13;

import java.util.*;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList => List 타입 == Collection Framework : List, Set, Map의 종류들이 있다.

		// ArrayList 선언 : List<String> 변수이름 = new ArrayList<String>(); => 저장데이터 타입 :
		// String
		List<String> list = new ArrayList<String>(); // java.util 에 소속되어 있다.
		// < > 안에는 같은 타입이 들어가야 한다. 개발자가 변경가능하다.
		// < > 안에 있는 타입만 ArrayList안에 들어갈 수 있다.
		// < > 안에는 클래스명만 들어갈 수 있다. String도 클래스명이다.

		// list에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		// 차곡차곡 저장이 된다. 선언 이후 저장한 데이터는 계속 차곡차곡 저장이 된다.

		// 특정 인덱스의 새로운 값을 넣으면 기존에 있던 값은 다음 인덱스로 밀리게 된다.
		list.add(1, "네번째");
		list.add(1, "다섯번째");
		// 계속 밀린다. 일명 세치기 같은 개념이다.

		// list에 담긴 데이터 출력 : get메소드 호출 => 숫자가 매개값으로 쓰인다. 숫자는 인덱스 번호를 의미한다.
		// get메소드를 호출할 경우 ()소괄호 안에 변수나 숫자를 입력 해 주어야 한다.
		// 인덱스 순서는 배열의 인덱스 순서와 동일하다.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// list 크기 확인 : size메소드 호출
		System.out.println(list.size());

		// list 데이터 삭제 : remove메소드 호출 => ()소괄호에는 인덱스 값을 넣어주면 해당 인덱스의 값이 지워지고 밑에있는 값들이
		// 당겨진다.
		// remove메소드 : 해당 인덱스의 값을 지우면 해당인덱스 +1 위치의 값이 해당 인덱스를 채워준다.
		list.remove(1);
		System.out.println(list.get(1));

		System.out.println();

		// for문을 이용하여 list에 담긴 모든 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// list에 정수 저장할 때 : Integer클래스(Wrapper Class라고 부른다) 이용
		List<Integer> list1 = new ArrayList<Integer>();

	}

}
