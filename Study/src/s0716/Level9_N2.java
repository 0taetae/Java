<<<<<<< HEAD
package s0716;

import java.util.Scanner;
import java.util.ArrayList;

public class Level9_N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		int m=0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				arr[m]=i;
				m++;
			}
		}
		System.out.println(arr[K-1]);
		

	}

}
=======
package s0716;
import java.util.Scanner;

public class Level9_N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		int m=0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				arr[m]=i;
				m++;
			}
		}
		System.out.println(arr[K-1]);

	}

}
>>>>>>> 98c325dc73ff6d9538bc19e1d484d69ce50a88a4
