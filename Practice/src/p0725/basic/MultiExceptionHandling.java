package p0725.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionHandling {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	try {
        Class.forName("abc.Def"); // ClassNotFoundException
        new FileInputStream("Hello.java"); // FileNotFoundException
        DriverManager.getConnection("Hello"); // SQLException
    	}catch(ClassNotFoundException | FileNotFoundException e) {
    		e.printStackTrace();
    		System.out.println("사용하려는 리소스가 없음");
    	}catch(SQLException e) {
    		e.printStackTrace();
    		System.out.println("DB에 접속 불가");
    	}catch(Exception e) {  // catch 문 중 가장 위에 두면, 모든 예외를 한번에 처리 -> 예외 상황 별 처리가 어려움
    		e.printStackTrace();
    	}
    	
    	
        // END
        System.out.println("프로그램 정상 종료");

    }
}
