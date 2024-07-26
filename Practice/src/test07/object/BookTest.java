package test07.object;

/**
 * 도서 객체를 생성하고 정보를 출력하는 클래스
 */
public class BookTest {
	public static void main(String[] args) {
		// 도서 정보를 저장하는 객체를 생성한다.
		Book b1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book b2 = new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링");

		System.out.println("**********************도서목록**********************");
		System.out.println(b1.toString()); // 생성한 도서 정보를 조회하여 출력한다.
		System.out.println(b2);
	}
}
