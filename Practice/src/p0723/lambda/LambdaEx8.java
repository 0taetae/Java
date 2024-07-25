package p0723.lambda;

@FunctionalInterface
interface Calculate{
	public int calc(int a,int b);
}
public class LambdaEx8 {
	public static void main(String[] args) {
		Calculate m1=(a,b)->a+b;
		Calculate m2=(a,b)->a-b;
		
		int m3=m1.calc(10, 20) + m2.calc(30, 40);
		System.out.println("결과: " + m3);
	}
}
