package p0725.exception;


//unchecked exception
public class ExceptionEx1 {
	
	public static void main(String[] args) {
		
		int val = 5;
		
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val/n);
		}catch(Exception e) {
			System.out.println("입력값에 오류가 있음:"+e);
		}finally {
			System.out.println("종료");
		}
		
		/*int val=5;
		
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(val/n);
			//return;  // return을 거치더라도 finally도 실행됨
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없음"+e);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 없다");
		}finally {
			System.out.println("**무조건 실행");
		}*/
		

	}

}
