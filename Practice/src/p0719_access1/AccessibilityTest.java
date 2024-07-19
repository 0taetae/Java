package p0719_access1;

public class AccessibilityTest {

	public static void main(String[] args) {
		// Q. AccessibilityClass 객체를 생성해 봅시다.
		AccessibilityClass accessibilityClass = new AccessibilityClass();
				
		// Q. name에 접근해 봅시다.
		System.out.println("name: " + accessibilityClass.name);
				
		// Q. money에 접근해 봅시다.
		System.out.println("money: " + accessibilityClass.money);
				
		// Q. height에 접근해 봅시다.
		System.out.println("height: " + accessibilityClass.height);
				
		// Q. weight에 접근해 봅시다.
		System.out.println("weight: " + accessibilityClass.weight);
				
		// Q. weight에 접근하는 경우 발생하는 메시지를 작성해 봅시다.
		System.out.println("private 접근자를 갖는 weight에 접근하면 The field AccessibilityClass.weight is ____ ____이 발생합니다.");

	}

}
