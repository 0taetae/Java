package p0722.box;

public class UseBoxTest {

	public static void main(String[] args) {
		useNormalBox();
		useGenericBox();
		useNumberBox();

	}
	private static void useNormalBox() {
		// NormalBox 타입의 객체를 생성하고 사용해보세요
		NormalBox box = new NormalBox();
		box.setSome(1);
		box.setSome("Hello");   // 뭐든지 담을 수 있는 박스
		
		Object some = box.getSome();
		if(some instanceof String str) {  // 런타임에 타입 체크
			System.out.println("문자열: "+ str+", 길이는 "+str.length());
		}
	}
	

	private static void useGenericBox() {
		// GenericBox 타입의 객체를 생성하고 사용해보세요
		GenericBox<String> box = new GenericBox<>();
		box.setSome("Hello"); // setSome의 타입이 문자열로 바뀌어있음 -> 타입에 대한 체크 완료
		String some = box.getSome(); // 원하는 타입으로 바로 사용 가능
		System.out.println("문자열:"+some+", 길이는 "+some.length());
	}
	private static void useNumberBox() {
		// NumberBox 타입의 객체를 생성하고 사용해보세요
		NumberBox<Integer> box = new NumberBox<>();
		box.addAll(1,2,3,4,5);
		//box.addAll((Integer[])new Object[] {1,2,"Hello"});  // generic을 배열에서 쓰지 말기
	}
	

	

}
