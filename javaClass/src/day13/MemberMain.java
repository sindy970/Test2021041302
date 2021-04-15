package day13;

public class MemberMain {

	public static void main(String[] args) {
		// Member 클래스 객체 선언
		// 기본생성자를 이용한 객체선언
		// 클래스이름 변수명 = new 생성자명();
		Member m1 = new Member();

		m1.info();
		// 필드의 값을 넣지 않았기 때문에 0과 null이 나온다.
		m1.id = "id11";
		m1.password = "비밀번호";
		m1.name = "이름이름";
		m1.age = 99;
		m1.info();

		m1.update("변경이름");
		m1.info();

		m1.myName(); // return이 존재하여 호출만 하고 끝나면 안됨
		// print문이 존재하지 않아서 출력이 안됨

		String name1 = m1.myName();
		System.out.println(m1.myName());

		// 매개변수가 있는 생성자를 이용한 객체선언
		Member m2 = new Member("id1", "pppp", "이름1", 11);

		m2.info();
	}

}
