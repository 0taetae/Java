package p0722_collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
//Set : 중복 허용 X, 순서유지 X
public class SetEx {

	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		//Set set = new Set();  // 인터페이스이기 때문에 Set 자체로 만들 수 없음
		
		@SuppressWarnings("rawtypes")
		Set set = new HashSet();
		set.add("one");
		set.add(2);  // primitive type : 기본형이기 때문에 new Integer(2)로 들어감
		set.add(3.0f);
		set.add(2);
		set.add(4.0f);
		set.add(4.00);
		set.add(new String("one"));
		System.out.println(set);
		
		@SuppressWarnings("rawtypes")
		Iterator iter = set.iterator();  // 처음에 첫번째 주소를 참조
		while(iter.hasNext()) {          // 하나씩 뒤로 참조
			System.out.println(iter.next());
		}
		

	}

}
