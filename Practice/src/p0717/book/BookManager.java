package p0717.book;

public class BookManager {
	private static int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size;
	
	public void add(Book book) {
		books[size] = book;
		size++;
	}
	public Book[] getList() {
		System.out.println("****************도서목록**************");
		return books;
	}
	
	public void remove(String isbn) {
		for(int i=0;i<MAX_SIZE;i++) {
			if(books[i]==null) continue;
			if(books[i].getIsbn().equals(isbn)) {
				books[i] = null;
				System.out.println("***********도서삭제 : "+isbn+"************");
			}
		}
	}
	
	public Book searchByIsbn(String isbn) {
		System.out.println("********도서조회 : "+isbn+"**********");
		for(int i=0;i<MAX_SIZE;i++) {
			if(books[i]==null) continue;
			if(books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null;  //예외
	}
	
}
