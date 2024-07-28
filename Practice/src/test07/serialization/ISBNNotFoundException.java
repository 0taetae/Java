package test07.serialization;

/**
 * 도서고유 번호가 존재하지 않는 예외정보를 나타내는 클래스
 */
public class ISBNNotFoundException extends Exception {

	private String isbn;
	
	public ISBNNotFoundException(String isbn) {
		super(isbn+"고유번호는 존재하지 않습니다.");
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}
}
