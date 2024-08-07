package p0722.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ListEx1 {

	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("one");
		list.add(2);  
		list.add(3.0f);
		list.add(2);
		list.add(4.0f);
		list.add(4.00);
		list.add(new String("one"));
		System.out.println(list);
		
		//list.remove(2);  // index(순서) 의미
		list.remove(Integer.valueOf(2));  // Object(값) 의미
		
		@SuppressWarnings("rawtypes")
		Iterator iter = list.iterator();  
		while(iter.hasNext()) {         
			System.out.println(iter.next());
		}
		

	}

}
