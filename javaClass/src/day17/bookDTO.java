package day17;

public class bookDTO {
	//필드 선언
	private int bookNumber, clientNumber;
	private String bookName, author; 
	private boolean check; //대여 가능 책 관리를 위한 변수
	
	//기본생성자 선언
	public bookDTO() {
	
	}

	public bookDTO(int bookNumber, int clientNumber, String bookName, String author, boolean check) {
		super();
		this.bookNumber = bookNumber;
		this.clientNumber = clientNumber;
		this.bookName = bookName;
		this.author = author;
		this.check = check;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isCheck() {
		//논리형 변수는 get 대신 is로 출력을 할 수 있다.
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "bookDTO [bookNumber=" + bookNumber + ", clientNumber=" + clientNumber + ", bookName=" + bookName
				+ ", author=" + author + ", check=" + check + "]";
	}


}
