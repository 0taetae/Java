package p0723_lambda;

@FunctionalInterface
interface Ver{
	public String call(String v);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		// equals를 사용해서 "자바"이면  "Java 17", 그렇지 않으면 "Spring 5.0" 출력
		
		Ver vv=(s) -> (s.equals("자바")?"ver 17":"ver 5.0");
		System.out.println("Java " + vv.call("자바"));
		System.out.println("Spring " + vv.call("스프링"));
		
		//--------------------------------------------------------
/*		Ver m1=(v) -> {
			return "Java " + v;   // or Var m1=(v)-> "Java " + v;
		};
		System.out.println(m1.call("ver 17"));
		
		Ver m2=(v)-> "Spring " + v;
		System.out.println(m2.call("ver 5.0"));   */
	}
}
