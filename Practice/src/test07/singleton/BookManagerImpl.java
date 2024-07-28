package test07.singleton;

import java.util.Arrays;


public class BookManagerImpl implements IBookManager {

	private static int MAX_SIZE = 100;

	private Book[] books = new Book[MAX_SIZE];

	private int size;

	private static IBookManager instance = new BookManagerImpl();

	private BookManagerImpl() { // 외부에서 객체 생성을 하지 못하도록 접근 제어자를  private으로 만든 생성자
	}

	public static IBookManager getInstance() {
		return instance;
	}

	@Override
	public void add(Book book) {
		if(size<MAX_SIZE) books[size++] = book;
	}

	@Override
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

	@Override
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, size);
	}

	@Override
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; ++i) {
			if (books[i].getIsbn().equals(isbn)) return books[i]; 
		}
		return null;
	}

	@Override
	public Book[] searchByTitle(String title) {
		int count = 0; 
		for (int i = 0; i < size; ++i) {
			if (books[i].getTitle().contains(title)) ++count;
		}
		
		Book[] result = new Book[count];
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i].getTitle().contains(title)) {
				result[idx++] = books[i];
			}
		}
		return result; 
	}

	@Override
	public Magazine[] getMagazines() {
		int count = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i] instanceof Magazine) ++count;
		}
		
		Magazine[] result = new Magazine[count];
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i] instanceof Magazine) {
				result[idx++] = (Magazine)books[i];
			}
		}
		return result;
	} 

	@Override
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

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < size; ++i) {
			total += books[i].getPrice();
		}
		return total;
	}

	@Override
	public double getPriceAvg() {
		return (double)getTotalPrice()/ size;
	}
}
