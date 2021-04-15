package day13;

public class BoardMain {

	public static void main(String[] args) {
		// Board클래스를 이용한 main클래스

		// 기본생성자를 이용한 객체선언
		Board ard1 = new Board();

		ard1.boardWrite(11, "제목이지롱", "딩동댕동", "나랏말싸미듕국의달아");
		ard1.boardView();
		ard1.boardUpdate("제목뿅", "얄리얄리얄라셩얄라리얄라");
		ard1.boardView();

		// 모든필드를 매개변수로 하는 생성자를 이용한 객체선언
		Board ard2 = new Board(10, "제목이당", "홍길동이", "이런저런내용");
		ard2.boardView();

	}

}
