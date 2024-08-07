package test07.inheritance;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManager {
	/**
	 * 관리할 최대 도서 수
	 */
	private static int MAX_SIZE = 100;
	/**
	 * 관리할 도서 리스트
	 */
	private Book[] books = new Book[MAX_SIZE];
	/**
	 * 현재 등록된 도서 수
	 */
	private int size;
		
	/**
	 * 도서를 도서리스트에 추가한다.
	 * @param book : 추가할 도서
	 */
	public void add(Book book) {
		if(size<MAX_SIZE) books[size++] = book;
	}
	/**
	 * 고유번호로 해당 도서를 도서리스트에서 삭제한다.
	 * @param isbn : 삭제할 도서의 고유번호
	 */
	public void remove(String isbn) {
		for (int i = 0; i < size; ++i) {
			// 삭제할 도서를 찾았다면 해당 도서 위치에 배열의 제일 마지막 도서를 복사
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size-1];
				books[size-1]=null;			// 삭제된 도서 위치 null 처리
				--size;						// 등록된 도서 수 감소
				break;
			}
		}
	}
	/**
	 * 등록된 도서리스트를 반환한다.
	 * @return 등록된 전체 도서리스트
	 */
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, size);
	}
	/**
	 * 고유번호로 해당 도서를 조회한다.
	 * @param isbn : 조회할 도서의 고유번호
	 * @return 고유번호에 해당하는 도서
	 */
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; ++i) {
			if (books[i].getIsbn().equals(isbn)) return books[i]; 
		}
		return null;
	}
	/**
	 * 도서 제목을 포함하고 있는 도서리스트를 반환한다.
	 * @param title : 조회할 도서의 제목
	 * @return
	 */
	public Book[] searchByTitle(String title) {
		int count = 0; 
		for (int i = 0; i < size; ++i) {	// 도서 제목을 포함하는 도서의 개수 카운트
			if (books[i].getTitle().contains(title)) ++count;
		}
		Book[] result = new Book[count];	// 결과 카운트만큼 배열 생성
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i].getTitle().contains(title)) { // 도서 제목을 포함하는 도서만 배열에 담기
				result[idx++] = books[i];
			}
		}
		return result; 
	}
	/**
	 * 잡지리스트를 반환한다.
	 * @return 잡지리스트
	 */
	public Magazine[] getMagazines() {
		int count = 0;
		for (int i = 0; i < size; ++i) {	// 잡지 개수 카운트
			if (books[i] instanceof Magazine) ++count;
		}
		Magazine[] result = new Magazine[count];	// 결과 카운트만큼 배열 생성
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i] instanceof Magazine) {	// 잡지만 배열에 담기
				result[idx++] = (Magazine)books[i];
			}
		}
		return result;
	} 
	/**
	 * 잡지가 아닌 도서리스트를 반환한다. 
	 * @return 잡지가 아닌 도서리스트
	 */
	public Book[] getBooks() {
		int count = 0; 
		for (int i = 0; i < size; ++i) {
			if (!(books[i] instanceof Magazine)) ++count;
		}
		
		Book[] result = new Book[count];
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (!(books[i] instanceof Magazine)) {
				result[idx++] = books[i];
			}
		}
		return result;
	}
	/**
	 * 도서리스트의 가격의 총합을 반환한다.
	 * @return 모든 도서 가격의 총합
	 */
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < size; ++i) {
			total += books[i].getPrice();
		}
		return total;
	}
	/**
	 * 도서가격의 평균을 반환한다.
	 * @return 모든 도서 가격의 평균
	 */
	public double getPriceAvg() {
		return (double)getTotalPrice()/ size;
	}
}
