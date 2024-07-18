package p0717;

public class Person {
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void eat() {
		System.out.println("냠냠");
	}
	public void jump() {
		System.out.println("폴짝");
	}
	@Override
	public String toString() {
		return name;
	}

	

}
