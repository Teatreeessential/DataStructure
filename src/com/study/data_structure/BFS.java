package com.study.data_structure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	static int nV;
	static int nE;
	static int[][] arr;
	static boolean[] visit;
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Boolean> hash = new HashMap<>();
		q.offer(i);
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			visit[temp] = true;
			System.out.println(temp+"정점 탐색");
			for(int j=1;j<nV+1;j++) {
				if(arr[temp][j]==1&&visit[j]==false) {
					if(!hash.containsKey(j)) {
						q.offer(j);
						hash.put(j, true);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정점의 갯수");
		nV = sc.nextInt();
		arr = new int[nV+1][nV+1];
		visit = new boolean[nV+1];
		System.out.println("간선의 갯수");
		nE= sc.nextInt();
		
		for(int i=0;i<nE;i++) {
			System.out.println(i+1+"정점의 간선 시작점");
			int start = sc.nextInt();
			System.out.println(i+1+"정점의 간선 끝점");
			int end  = sc.nextInt();
			arr[start][end] = arr[end][start] = 1;
		}
		
		bfs(1);
		
	}
	
	
}
