package p0717;

//������ ȣ��

class ParentEx /*extends Object*/{
	public ParentEx() {
		/*super();*/
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx{
	public ChildEx() {
		/*super();*/
		System.out.println("child class");
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx();

	}

}
