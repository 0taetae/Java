package p0725.basic;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	try {
    		Class<?> myclass = Class.forName("p0725_basic");  // ClassNotFoundException를 다루지 않음  => try catch 문
        	// Class.forName() : 클래스 조사
    		System.out.println(myclass.getName()); 
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	
        //Class.forName("abc.Def");

        // END
        System.out.println("프로그램 정상 종료");
    }

}
