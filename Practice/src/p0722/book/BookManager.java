package p0722.book;

import java.util.Arrays;

public class BookManager {
	private static int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size;
	
	public void add(Book book) {
		books[size] = book;
		size++;
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
	
	public Book[] getList() {
		
		return Arrays.stream(books).filter((i)-> (i instanceof Book == true)).toArray(Book[]::new);
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
	
	public Book[] searchByTitle(String title) {
		System.out.println("********도서 제목 포함 검색 : "+title+"**********");
		return Arrays.stream(getList()).filter((book)-> book.getTitle().contains(title)).toArray(Book[]::new);
	}
	public Magazine[] getMagazines() {
		
		return Arrays.stream(books).filter((i)->(i instanceof Magazine == true)).toArray(Magazine[]::new);
		
	}
	public Book[] getBooks() {
		return Arrays.stream(books).filter((i) -> (i instanceof Magazine == false)).toArray(Book[]::new);
		
	}
	
	public int getTotalPrice() {
		return Arrays.stream(getList()).mapToInt((i)->i.getPrice()).sum();
		
	}
	public double getPriceAvg() {
		return Arrays.stream(getList()).mapToInt((i)->i.getPrice()).average().orElse(0);
		
	}
}
