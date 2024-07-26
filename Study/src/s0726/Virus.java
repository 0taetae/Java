package s0726;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 컴퓨터의 수 = 정점의 개수 
		int K = sc.nextInt(); // 컴퓨터 쌍의 수 = 간선의 개수 

		boolean visited[] = new boolean[N + 1]; // 바이러스 여부 = 방문 여부

		LinkedList<Integer>[] list = new LinkedList[N + 1];  // 컴퓨터 리스트

		for (int i = 0; i <= N; i++) {
			list[i] = new LinkedList<Integer>();
		}

		for (int i = 0; i < K; i++) {  // 리스트의 index = 컴퓨터 번호
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}

		BFS(1, list, visited);
		
		for(int i=0;i<=N;i++) {  // 바이러스 감염 컴퓨터 개수
			if(visited[i]) {
				count++;
			}
		}
		System.out.println(count-1);  // 1번 컴퓨터를 제외
	}

	public static void BFS(int start, LinkedList<Integer>[] list, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[start] = true; 
		q.add(start);

		while(q.size() != 0) { 
			start = q.poll(); 
			//System.out.print(v + " ");
			//count++;

			Iterator<Integer> iter = list[start].listIterator();
			while(iter.hasNext()) { 
				int w = iter.next(); 
				if(!visited[w]) { 
					visited[w] = true; 
					q.add(w); 
				} 
			}
		}
		//return count;
	}
		
		
	
}
