package day13;

public class Member {
	// 필드 선언
	//필드에 초기값을 설정하지 않아도 자동으로 0 &null로 세팅이 된다.
	String id;
	String password;
	String name;
	int age;

	// 기본생성자 선언
	// 생성자 이름 : 클래스이름과 동일
	Member() {

	}

	// 모든필드를 매개변수로 하는 생성자
	Member(String id, String password, String name, int age) {
		// 각각의 필드값을 세팅하는 것이 생성자의 주요 목적이다.

		// 매개변수로 받은 값을 각 필드에 저장
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	// 메소드 선언
	// return x, 매개변수 x
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
		//필드를 사용하는 경우에는 되도록이면 this를 이용하는 것이 좋다.
	}
	
	//name 필드값을 수정하는 메소드
	//return x, 매개변수 o
	void update(String name) {
		// name을 매개변수로 받아서 그 값을 필드에 저장
		this.name = name;
	}
	
	//return o(name), 매개변수 x
	String myName() {
		return this.name; //필드값이기 때문에 this를 붙인다.
	}
}
