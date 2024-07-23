package s0723;

import java.util.Arrays;
import java.util.Scanner;

public class Level15_N8 {
	static int N;
	static int[] arr;
	static int[] window(int num) {
		for(int i=num-1;i<N;i*=2) {
			if(arr[i]==1) {
				arr[i]=0;
			} else if(arr[i] == 0) {
				arr[i]=1;
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		Arrays.fill(arr, 0);
		for(int i=1;i<=N;i++) {
			window(i);
		}
		System.out.println(Arrays.stream(arr).sum());
	}

}
