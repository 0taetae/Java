package p0722.collection;

import java.util.ArrayList;
import java.util.List;

public class ListError {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(Integer.valueOf(10));
		list.add("겨울");
		list.add(4.0);
		
		for(int i=0; i<list.size(); i++) {
			String s=(String)list.get(i); //13번째 라인에서 오류 발생(ClassCastException)
			System.out.println(s);
		}

	}

}
