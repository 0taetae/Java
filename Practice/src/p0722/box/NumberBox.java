package p0722.box;

public class NumberBox<T extends Number> {
	
	public void addAll(T...ts) {
		double sum =0;
		for(T t:ts) {
			sum+=t.doubleValue();
		}
		System.out.println(sum);
	}
}
