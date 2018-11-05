package com.study.data_structure;

import java.util.Scanner;

public class DFS {
	static int nV;
	static int nE;
	static int [][]arr;
	static boolean []visit;
	
	public static void dfs(int i){
		
		visit[i] = true;
		System.out.println(i+"번째 정점찍음");
		for(int j=1;j<nV+1;j++) {
			if(arr[i][j]==1&&visit[j]==false) {
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nV = sc.nextInt();
		nE = sc.nextInt();
		arr = new int[nV+1][nV+1];
		visit = new boolean[nV+1];
		
		for(int i =0;i<nE;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			arr[start][end] = arr[end][start] = 1;
		}
		
		dfs(1);
	}

}
