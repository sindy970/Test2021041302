package day13;

public class Board {
	// 필드 선언
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;

	// 기본생성자 선언
	Board() {

	}

	// 모든 필드를 매개변수로 하는 생성자 선언
	Board(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}

	// return x, 매개변수 o
	// 매개변수값을 필드에 저장하기
	void boardWrite(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}

	// return x, 매개변수 x
	// 모든 필드값 출력하기
	void boardView() {
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}

	// return x, 매개변수 o
	// 제목과 내용 수정하기
	void boardUpdate(String bTitle, String bContents) {
		this.bTitle = bTitle;
		this.bContents = bContents;
	}

}
