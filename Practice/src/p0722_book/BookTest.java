package p0722_book;


public class BookTest {

	public static void main(String[] args) {
		BookManager ob = new BookManager();
		
		Book ob1 = new Book("123","t1","a1","p1",123,"d1");
		Book ob2 = new Book("456","t2","a2","p2",456,"d2");
		Book ob3 = new Book("789","t3","a3","p3",789,"d3");
		
		
		ob.add(ob1);
		ob.add(ob2);
		ob.add(ob3);
		Magazine ob4 = new Magazine("789","t3","a3","p3",789,"d3",2021,1);
		ob.add(ob4);
		for(Book book : ob.getList()) {
			if(book == null) continue;
			System.out.println(book);
		}
		
		System.out.println("***일반도서목록***");
		for(Book book : ob.getBooks()) {
			if(book == null) continue;
			System.out.println(book.toString());
		}
		
		System.out.println("***잡지 목록***");
		for(Magazine magazine : ob.getMagazines()) {
			if(magazine == null) continue;
			System.out.println(magazine.toString());
		}
		
		for(Book book : ob.searchByTitle("1")) {
			if(book == null) continue;
			System.out.println(book.toString());
		}
		
		System.out.println("도서 가격 총합 : "+ob.getTotalPrice());
		System.out.println("도서 가격 평균 : "+ob.getPriceAvg());

	}

}
