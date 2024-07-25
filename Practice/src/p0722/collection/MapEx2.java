package p0722.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Book ob1=new Book("java","kim",100);
		Book ob2=new Book("c++","lee",250);
		Book ob3=new Book("oracle","park",300);
		
		// map에 ob1,ob2,ob3를 추가하시오
		
		Map<String,Book> map = new HashMap<>();
		map.put(ob1.getTitle(),ob1);
		map.put(ob2.getTitle(), ob2);
		map.put(ob3.getTitle(), ob3);
		
		// 출력
		Set<String> keys = map.keySet();
		for(String n:keys) {
			System.out.println(map.get(n).getAuthor());
		}
		//--------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 도서명: ");
		String title = sc.next();
		
		if(map.get(title)==null) {
			System.out.println("찾는 도서가 없습니다");
		}
		else {
			System.out.println(map.get(title).getTitle()+" "+map.get(title).getAuthor()+" "+map.get(title).getPage());
		}
	}
}















