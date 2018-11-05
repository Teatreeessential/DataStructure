package com.study.data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS_list {
	
	static int nV;
	static int nE;
	static boolean []visit;
	static ArrayList<ArrayList<Integer>> list;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.println(i+"번 째 정점 탐색");
		
		for(int j:list.get(i)) {
			if(visit[j]==false) {
				dfs(j);
			}
		}
		
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<>();
		nV =  sc.nextInt();
		nE = sc.nextInt();
		visit = new boolean[nV+1];
		
		for(int i=0;i<nV+1;i++) {
			list.add(new ArrayList<Integer>());
		}//만약 정점이 5라면 list안에 6개의 arraylist를 생성하고 저장하고 첫번째 0인 정점에 있는 리스트는 방문하지 않는다.
		for(int j=0;j<nE;j++) {
			//이 때 입력을 수행할 때 인덱스 0은 기입해서는 안된다.
			System.out.println("간선의 start지점");
			int start = sc.nextInt();
			System.out.println("간선의 end 지점");
			int end = sc.nextInt();
			
			list.get(start).add(end);
			list.get(end).add(start);
			
			
		}
		dfs(1);
		
		
	}
}
