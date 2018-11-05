package com.study.data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_list {
	
	static int nV;
	static int nE;
	static ArrayList<ArrayList<Integer>> list;
	static boolean[] visit;
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		 HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
		 
		 q.offer(i);
		 
		 while(!q.isEmpty()) {
			 
			 int temp = q.poll();
			 visit[temp] = true;
			 System.out.println(temp+"정점 탐색");
			 for(int j:list.get(temp)) {
				 if(visit[j]==false&&!hash.containsKey(j)) {
					 q.offer(j);
					 hash.put(j,true);
				 }
			 }
			 
		 }
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정점의 갯수를 입력하시오");
		nV = sc.nextInt();
		System.out.println("간선의 갯수를 입력하시오");
		nE = sc.nextInt();
		list = new ArrayList<>();
		visit = new boolean[nV+1];
		
		for(int i=0;i<nV+1;i++) {
			list.add(new ArrayList());
		}
		
		for(int j=0;j<nE;j++) {
			System.out.println(j+1+"정점의 간선 시작점");
			int start = sc.nextInt();
			System.out.println(j+1+"정점의 간선 끝점");
			int end  = sc.nextInt();
			list.get(start).add(end);
			list.get(end).add(start);
			
			
		}
		bfs(1);
	}
}
