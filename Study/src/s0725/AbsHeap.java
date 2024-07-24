package s0725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

public class AbsHeap {
	static int N;
	static int[] arr;
	static int pmin = (int) Math.pow(2, 31);
	static int mmin = (int) -Math.pow(2, 31);
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			int X = Integer.parseInt(br.readLine());
			if(X!=0) {
				
			}
			else {
				Arrays.stream(arr).filter(item -> item!=(ABS(arr))).toArray(int[]::new);
			}  // 절댓값의 최솟값 -> 양수중에서는 작은수, 음수중에서는 큰수
		}

	}
	static int ABS(int[] arr) {
		for(int i=0;i<N;i++) {
			if(arr[i]>0) {
				if(arr[i]<pmin) {
					pmin = arr[i];
				}
			}
			if(arr[i]<0) {
				if(arr[i]>mmin) {
					mmin = arr[i];
				}
			}
		}
		return Math.min(pmin, Math.abs(mmin));
	}

}
