package p0722.box;

import p0717.Person;
import p0717.spider.SpiderMan;

public class GenericAttention<I> {

    public void useRawType() {
        // TODO: 다음에서 발생하는 warning을 제거해보자.
    	@SuppressWarnings("rawtypes")
        GenericBox box = new GenericBox();

        // END
    }

    public void confusing() {

        GenericBox<Person> pbox = new GenericBox<>();
        // TODO: pbox에 담을 수 있는 객체를 담아보자.
        pbox.setSome(new Person("피터파커"));
        pbox.setSome(new SpiderMan());
        // END

        // TODO: pbox를 다른 객체로 대체해보자.
        //pbox = new GenericBox<SpiderMan>{}; // 타입이 다르므로 안된다.
        GenericBox<SpiderMan> sbox = new GenericBox<>();  // pbox != sbox
        // END
    }

    
	public void cantUseGeneric() {
        //I i = new I();//Cannot instantiate the type I

        GenericBox<SpiderMan> obj = new GenericBox<>();

        // compile error : Type Object cannot be safely cast to GenericBox<String>
        //if(obj instanceof GenericBox<String>) {  }  // 안됨

        if (obj instanceof GenericBox gb) {
        	GenericBox<SpiderMan> casted = (GenericBox<SpiderMan>)gb; // raw type으로 받았으므로 타입이 확실하지 않음
            gb.setSome("Hello"); // 타입에 안전하지 않음
            System.out.println("맞지만 타입에 안전하지 않음: " + gb.getSome());
        }

        if (obj instanceof GenericBox<?> gb) {  // GenericBox는 타입 파라미터가 적용되었나요?
            // gb.setSome("Hello"); // compile error
            System.out.println("이것이 최선: 뭐든 담기는 GenericBox");
        }
    }

    public void genericArray() {
        // Generic 타입으로는 배열 생성 불가 
        // GenericBox<String> [] boxes1 = new GenericBox<String>[3]; // compile error
        // GenericBox<String> [] boxes2 = new GenericBox<>[3]; // compile error

        GenericBox<Person>[] boxes3 = (GenericBox<Person>[]) new GenericBox[3];
        boxes3[0] = new GenericBox<Person>();
        // TODO: 위코드가 의미 있게 된다면 어떤 불상사가 발생하는지 생각해보자.
        GenericBox<String> strbox = new GenericBox<String>("hello");
        boxes3[1] = (GenericBox)strbox;  // 형변환 -> 타입의 안정성 확보 X -> 이렇게 쓰면 안된다.
        // END
    }

    public static void main(String[] args) {
        GenericAttention<Integer> ga = new GenericAttention<>();
        // ga.cantUseGeneric();
        ga.genericArray();
    }
}
