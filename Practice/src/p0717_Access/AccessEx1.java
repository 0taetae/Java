package p0717_Access;


public class AccessEx1{
	private int x=10;
	private int y=20;
	
	public static void main(String[] args) {
		AccessEx1 ob1=new AccessEx1();
		System.out.println(ob1.x +"  " + ob1.y);
		
		AccessEx2 ob2=new AccessEx2();
		System.out.println(ob2.x +"  " + ob2.y);
		
	}
}
