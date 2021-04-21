package day17;

import java.util.*;

public class bookMain {

	public static void main(String[] args) {
		//도서 대여 관리 프로그램
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int cho;
		
		bookService bs = new bookService();
		List<bookDTO> bookList = new ArrayList<bookDTO>();
		List<clientDTO> clientList = new ArrayList<clientDTO>();
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.회원등록 | 2.도서등록 | 3.도서대출 | 4.도서목록 | 5.회원목록 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			cho = sc.nextInt();
			
			switch(cho) {
			case 1 :
				
				//객체 선언
				clientDTO client = new clientDTO();
				
				//회원 등록 : 이름과 전화번호 입력받기
				int count = clientList.size()	+ 1;
				
				System.out.print("이름 : ");
				client.setClientName(sc.next());
				
				System.out.print("전화번호 : ");
				client.setClientPhone(sc.next());
				
				client.setClientNumber(count);
				
				clientList.add(client);
				break;
				
			case 2 :

				//객체선언
				bookDTO book = new bookDTO();
				
				//도서 등록 : 도서명, 저자명 입력 받기
				count = bookList.size()	+ 1;
				System.out.print("도서명 : ");
				book.setBookName(sc.next());
				System.out.print("저자 : ");
				book.setAuthor(sc.next());
				
				book.setBookNumber(count);
				
				bookList.add(book);
				break;
				
			case 3 :
				
				//도서대출 : 고객번호, 빌릴책 번호를 입력받아 대출 유무를 판단 후 대출해준다
				bookList = bs.bookLoan(bookList);
				break;
				
			case 4 :
				
				//도서목록 : 책목록을 다 출력해준다.
				bs.bookList(bookList);
				break;

			case 5 :
				
				//회원목록 : 회원들을 모두 출력해준다.
				bs.clientList(clientList);
				break;
				
			case 6 :
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
		

	}

}
