﻿package p0723.test;

import java.util.ArrayList;
import java.util.Scanner;

import p0722.test.Book;
import p0722.test.BookProc;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id;
		String pw;
		
		System.out.print("ID를 입력하시오:");  id=sc.next();
		System.out.print("PW를 입력하시오:");  pw=sc.next();
		
		UserProc up=new UserProc();
		User entity=up.getLoginUser(id,pw);
		
		//나머지 완성하시오	
		if(entity != null) {
			System.out.println(entity.getId()+"님이 입장하셨습니다.");
			System.out.println(entity.getPoint()+"점 입니다.");
			
			BookProc bp = new BookProc();
			ArrayList<Book> list = bp.getList();
			for(Book ob:list) {
				System.out.println("책이름:"+ ob.getTitle()+"\t책저자:"+ob.getAuthor()+"\tp페이지:"+ob.getPage());
			}
			
			
			
		}
		else {
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.");
		}
	}
}
/* [문제1]
 * ID를 입력하시오 : pororo
 * PW를 입력하시오 : 1234
 * 뽀로로님이 입장하셨습니다
 * 현재포인터는 89.97점 입니다
 *
 *
 * ID를 입력하시오 : pororo
 * PW를 입력하시오 : 1235
 * ID 또는 PW가 틀리거나 존재하지 않는 ID입니다
 * -----------------------------------------------------
 * [문제2]
 * ID를 입력하시오 : pororo
 * PW를 입력하시오 : 1234
 * 
 * 뽀로로님이 입장하셨습니다
 * 현재포인터는 89.97점 입니다
 * 
 * [[BOOk의 정보보기]]
 * 책이름:JAVA    책저자:kim      페이지: 100
 * 책이름:C++     책저자:lee       페이지: 250
 * 책이름:JSP      책저자:park     페이지: 150
 * 
 */
