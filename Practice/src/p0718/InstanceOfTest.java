package p0718;

import p0717.Person;

public class InstanceOfTest {
    private void unsafeCasting() {
        Object obj = 1;
//        String s = (String) obj;
//        System.out.println(s.length());
        if(obj instanceof String str) {
        	System.out.println(str.length());
        }
        else {
        	System.out.println("문자열 아님");
        }
        
    }

    private void safeCasting() {
        // TODO: 위 메서드가 안전하게 형 변환할 수 있도록 수정해보자.

        // END
    }

    public static void main(String[] args) {
        InstanceOfTest instance = new InstanceOfTest();
        instance.unsafeCasting();
        instance.safeCasting();
    }

}
