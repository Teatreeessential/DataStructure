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
		System.out.println(i+"�� ° ���� Ž��");
		
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
		}//���� ������ 5��� list�ȿ� 6���� arraylist�� �����ϰ� �����ϰ� ù��° 0�� ������ �ִ� ����Ʈ�� �湮���� �ʴ´�.
		for(int j=0;j<nE;j++) {
			//�� �� �Է��� ������ �� �ε��� 0�� �����ؼ��� �ȵȴ�.
			System.out.println("������ start����");
			int start = sc.nextInt();
			System.out.println("������ end ����");
			int end = sc.nextInt();
			
			list.get(start).add(end);
			list.get(end).add(start);
			
			
		}
		dfs(1);
		
		
	}
}
