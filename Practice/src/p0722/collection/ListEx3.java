package p0722.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		Book ob1=new Book("java","kim",100);
		Book ob2=new Book("c++","lee",250);
		Book ob3=new Book("oracle","park",300);
		
		// list 객체
		List<Book> list = new ArrayList<>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		
		
		// iterator 이용
		Iterator<Book> iter = list.iterator();
		
		while(iter.hasNext()) {
			Book ob = iter.next();
			System.out.print("책이름: "+ ob.getTitle()+"\t");
			System.out.print("저자: "+ ob.getAuthor()+"\t");
			System.out.print("페이지: "+ ob.getPage()+"\t");
		}
		
		// forEach 이용
		for(Book ob:list) {
			System.out.print("책이름: " + ob.getTitle()+"\t");
			System.out.print("책저자: " + ob.getAuthor()+"\t");
			System.out.println("페이지: " + ob.getPage());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 도서명: ");
		String str = sc.next();
		boolean notFound=true;
		
		for(Book b:list) {
			if(b.getTitle().contains(str)) {
				notFound=false;
				System.out.printf("제목 : %-10s저자: %-10s페이지: %-10d\n",
						b.getTitle(),b.getAuthor(), b.getPage());
			}
		}
		
		
	}

}
