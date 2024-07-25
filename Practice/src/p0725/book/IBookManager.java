package p0725.book;

public interface IBookManager {
	void add(Book book);
	void remove(String isbn);
	Book[] getList();
	Book searchByIsbn(String isbn);
	Book[] searchByTitle(String title);
	Magazine[] getMagazines();
	Book[] getBooks();
	int getTotalPrice();
	double getPriceAvg();
	void buy(String string, int quantity) throws ISBNNotFoundException;
	void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
}
