package com.study.data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs_test {
	public static void main(String []args) {
		int nV;
		int nE;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		boolean visit[];
		Scanner sc = new Scanner(System.in);
		System.out.println("정점의 갯수는?");
		nV = sc.nextInt();
		System.out.println("간선의 갯수는?");
		nE = sc.nextInt();
		visit =new boolean[nV+1];
		for(int i=0;i<nV+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int j=1;j<nE+1;j++) {
			int start;
			int end;
			System.out.println("start 간선");
			start = sc.nextInt();
			System.out.println("end간선");
			end = sc.nextInt();
			list.get(start).add(end);
			list.get(end).add(start);
			
		}
		bfs(1,visit,list);
		
		
	}
	public static void bfs(int i,boolean [] visit,ArrayList<ArrayList<Integer>> list) {
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Boolean> hash = new HashMap<>();
		q.offer(i);
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			visit[temp] = true;
			System.out.println(temp+"정점 방문");
			for(int j:list.get(temp)) {
				if(visit[j]==false&&!hash.containsKey(j)) {
					q.offer(j);
					hash.put(j, true);
				}
			}
		}
	}
}
