package day17;

import java.util.*;

public class bookService {
	//도서 대출을 위한 처리 클래스
	
	Scanner sc = new Scanner(System.in);
	
	//도서 대출 메소드
	List<bookDTO> bookLoan(List<bookDTO> bookLoan){
		System.out.print("고객 번호 : ");
		int clientNumber = sc.nextInt();
		System.out.print("빌릴책 번호 : ");
		int bookNumber = sc.nextInt();
		
		if(bookLoan.get(bookNumber-1).isCheck() == false) {
			System.out.println("대출이 완료되었습니다.");
			bookLoan.get(bookNumber-1).setCheck(true);
			bookLoan.get(bookNumber-1).setClientNumber(clientNumber);
		} else {
			System.out.println("대출이 불가능 합니다.");
		}
		return bookLoan;
	}
	
	//도서목록 메소드
	void bookList(List<bookDTO> bookList) {
		for(int i = 0; i<bookList.size(); i++) {
			//get(i)를 설정해 주지 안으면 원하는 대로 값이 나오지 않는다.
			System.out.println(bookList.get(i));
		}
	}

	//회원목록 메소드
	void clientList(List<clientDTO> clientList) {
		for(int i = 0; i<clientList.size(); i++) {
			System.out.println(clientList.get(i));
		}
	}

}
