package p0719.interfaceex;

/* class와 interface를 이용하여 성적처리
  클래스명 : User
   -name:String
   +User()
   +User(name:String)
   +toString():String    --> "이름 : 홍길동" 를  리턴
   
   인터페이스명 : Score
   +sol:int           // 초깃값:20
   +getScore():int    // 맞은수 * sol을 리턴
   
   인터페이스명 : Print
   +toPaint():String
   
   [출력화면]
   이름 : 홍길동
   점수 : 60점
*/
class User {
	private String name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름 : "+name;
	}
}
//----------------------------------------------------
interface Score {
	public final int sol=20;  //final 생략 가능
	abstract public int getScore(); // abstract 생략 가능
}

//-----------------------------------------------------
interface Print{
	public String toString();
}

//-----------------------------------------------------
public class InterfaceEx3 extends User implements Score, Print {  // User,Score,Print 상속받기
	int s; // 맞은수
	
	public InterfaceEx3(String name,int s) {
		super(name);
		this.s = s;
	}
	public int getScore() {
		return s*sol;
	}
	public String toPaint() {
		return super.toString()+"\n점수 : "+getScore()+"점";
	}
		
	public static void main(String[] args) {
		InterfaceEx3 ob = new InterfaceEx3("홍길동", 3);
		System.out.println(ob.toPaint());
	}
}

