package p0717.book;

public class BookTest {

	public static void main(String[] args) {
		BookManager ob = new BookManager();
		
		Book ob1 = new Book("123","t1","a1","p1",123,"d1");
		Book ob2 = new Book("456","t2","a2","p2",456,"d2");
		Book ob3 = new Book("789","t3","a3","p3",789,"d3");
		
		ob.add(ob1);
		ob.add(ob2);
		ob.add(ob3);
		for(Book book : ob.getList()) {
			if(book == null) continue;
			System.out.println(book);
		}
		System.out.println(ob.searchByIsbn("123"));
		ob.remove("123");
		
		for(Book book : ob.getList()) {
			if(book == null) continue;
			System.out.println(book);
		}
		
		

	}

}
