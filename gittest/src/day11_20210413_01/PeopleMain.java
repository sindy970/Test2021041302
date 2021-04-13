package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		//실행을 하는 주체가 된다.
		//PeopleMain클래스에서 People클래스를 객체로 만들어 활용
		
		//People 클래스 객체 선언
		//Scanner객체 선언과 동일하게 한번만 선언하면 계속 사용이 가능하다.
		//형식 : 객체로만들클래스이름 현재파일에서쓸객체변수이름 = new 객체로만들클래스이름(); 
		People p = new People();
		//People : 객체로 만들 클래스 이름
		//p : 개발자가 마음대로 설정할 수 있는 변수 이름
		//		보통 클래스 이름과 동일한 소문자로 많이 사용한다.
		//new : 객체 선언할 때 new는 필수 항목이다.
		//People() : 해당 클래스가 가지고 있는 생성자 
		// 		   	 해당 클래스가 별도의 생성자를 정의하고 있지 않다면 기본생성자를 사용함
		// 기본 생성자 : 클래스와 동일한 이름이다.
		
		 
		//객체로 선언한 클래스가 가지고 있는 자원(필드,메소드) 활용
		// People 클래스가 가지고 있는 필드에 값 저장 및 출력
		p.name = "이름1"; //필드에 값을 저장하는 방법
		//형식 : 변수이름.필드선언변수이름 = 원하는값; ==> 변수사용하듯 사용하면 됨
		
		//기본생성자 안에서 만든 변수의 값이 출력 됨
		System.out.println(p.nation);
		p.nation = "미국"; //필드 값을 변경하는 것도 가능하다.
		
		System.out.println(p.name); //필드의 값을 출력하는 방법
		
		People p1 = new People();
		
		p1.name = "이름2";
		System.out.println(p1.name);
		//각 객체마다 독립적으로 사용 가능하고, 여러개 선언 가능 == 변수의 기능과 같다.
		
		p.age = 10;
		
		
		//매개변수가 있는 생성자를 이용한 객체 생성
		People p3 = new People("이름4", 10);
		//People(매개변수로 선언한 변수들의 값을 넣음);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation); //생성자에서 nation에 관안 언급이 없기 때문에 null이 나온것이다.
		//매개변수로 선언된 변수의 필드값도 변경 가능하다.
		
	}

}
