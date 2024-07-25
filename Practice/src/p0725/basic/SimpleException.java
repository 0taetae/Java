package p0725.basic;

public class SimpleException {
    public static void main(String[] args) {
        int[] intArray = { 10 };
        try {
        	System.out.println(intArray[2]);  // 예외 발생, ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e) {  // 예외 처리
        	System.out.println(e.getMessage());
        	//e.printStackTrace();
        }
        System.out.println("프로그램 종료합니다.");
    }
}
