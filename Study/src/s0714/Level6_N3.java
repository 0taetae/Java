package s0714;

import java.util.Scanner;

public class Level6_N3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i=1;i<=N;i++) {
			for(int j=N-i;j<=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
