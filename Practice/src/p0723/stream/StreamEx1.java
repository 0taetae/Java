package p0723.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamEx1 {
	public static void main(String[] args) {
//		int[] n= {1,2,3,4,5,6};
//		for(int i:n) {
//			System.out.println(i);
//		}		
		
//		Arrays.asList(1,2,3,4,5,6).stream().forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4).stream()
//		.map(i->i*i)
//		.forEach(System.out::println);
		
//		Arrays.asList(3,5,7,4,2).stream()  // 3 5 7 4
//		.limit(4)
//		.forEach(System.out::println);
		
//		Arrays.asList(3,5,7,4,2).stream()  // 7 4 2 (2개 skip)
//		.skip(2)
//		.forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4,5,6).stream()  
//		.filter(i -> i%2==0)
//		.forEach(System.out::println);
		
//		Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,10)).stream()
//		.flatMap(i -> i.stream()).forEach(j -> System.out.print(j+" "));

//		Arrays.asList(Arrays.asList(1,2,3,4,5)
//				      .stream()
//				      .reduce((a,b)->a-b)
//				      .get())
//		     .forEach(System.out::println);

//		Arrays.asList(1,2,3,4,5).stream()
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
		
		//[문제 1] 1 ~ 10 까지 3의 배수만 출력하시오
		Arrays.asList(1,2,3,4,5,6,7,8,9,10)
		.stream()
		.filter(i -> i%3==0)
		.forEach(System.out::println);
	}
}










