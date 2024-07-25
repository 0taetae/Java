package p0725.book;

import java.util.Arrays;

public class BookManagerImpl implements IBookManager {
	private static int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size;
	
	private static IBookManager instance = new BookManagerImpl();
	public static IBookManager getInstance() {
		return instance;
	}
	
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
		//System.out.println("********도서조회 : "+isbn+"**********");
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
	
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		Book bb = searchByIsbn(isbn);
		if(bb==null) {
			throw new ISBNNotFoundException(isbn);
		}
		int q = bb.getQuantity()+quantity;
		System.out.println("******도서구매:"+isbn+","+q+"개*********");
		bb.setQuantity(q);
		System.out.println(bb);
		
	}
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		Book bb= searchByIsbn(isbn);
		if(bb==null) {
			throw new ISBNNotFoundException(isbn);
		}
		int q = bb.getQuantity()-quantity;
		if(q<0) {
			throw new QuantityException();
		}
		System.out.println("******도서판매:"+isbn+","+q+"개*********");
		bb.setQuantity(q);
		System.out.println(bb);
		
	}
	
}
