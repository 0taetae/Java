package s0724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wheel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[4][8];  // N극 0,S극 1
		for(int i=0;i<4;i++) {
			String str = br.readLine();
			for(int j=0;j<8;j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		int K = Integer.parseInt(br.readLine());
		int[][] arr2 = new int[K][2];  // 톱니바퀴 번호, 방향(1 시계방향, -1 반시계방향)
		for(int i=0;i<K;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			arr2[i][0] = Integer.parseInt(st.nextToken());
			arr2[i][1] = Integer.parseInt(st.nextToken());
		}

	}

}
