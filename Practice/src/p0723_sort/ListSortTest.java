package p0723_sort;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import p0723_set.SmartPhone;


public class ListSortTest {

    private List<String> names = Arrays.asList("Hi", "Java", "World", "Welcome");

    public void basicSort() {
        // TODO: names를 이름의 오름차순, 또는 그 역순으로 정렬해서출력하시오.
    	Collections.sort(names);  // 크기를 비교할 수 있는 것은 잘 정렬된다.
    	Collections.reverse(names);  // 내림차순 정렬
    	System.out.println(names);
        // END
    }

    public void sortPhone() {
        // TODO: 전화 번호에 따라 SmartPhone을 정렬해보자.
    	List<SmartPhone> phones = Arrays.asList(new SmartPhone("010"), new SmartPhone("111"), new SmartPhone("100"));
        Collections.sort(phones);  // 크기를 비교할 수 없어서 불가능 -> Comparable
        System.out.println(phones);
    	// END
    }

    public void stringLengthSort() {
        // TODO: 문자열의 길이에 따라 names를 정렬해보자.

        // END
        System.out.println(names); // [Hi, Java, World, Welcome]
    }

    public static void main(String[] args) {
        ListSortTest st = new ListSortTest();
        //st.basicSort();
        st.sortPhone();
        // st.stringLengthSort();
    }

}
