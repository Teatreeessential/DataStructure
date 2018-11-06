package com.study.data_structure;

import java.util.Scanner;

public class dfs_test {
	public static void dfs(int i,boolean[] visit,int [][] arr) {
		
		visit[i] = true;
		System.out.println(i+"���� �湮");
		for(int j=1;j<arr.length;j++) {
			if(arr[i][j]==1&&visit[j]==false) {
				dfs(j,visit,arr);
			}
		}
	}
	
	public static void main(String []args) {
		int nV;
		int nE;
		boolean visit[]; 
		int arr[][];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�");
		nV = sc.nextInt();
		visit = new boolean[nV+1];
		arr = new int[nV+1][nV+1];
		System.out.println("������ ������ �Է��Ͻÿ�");
		nE = sc.nextInt();
		for(int i=0;i<nE;i++) {
			int start;
			int end;
			System.out.print("�����ϰ��� �ϴ� ���� start");
			start = sc.nextInt();
			System.out.println("�����ϰ����ϴ� ���� end");
			end = sc.nextInt();
			
			arr[start][end] = arr[end][start] = 1;
			
		}
		
		dfs(1,visit,arr);
	}
	
}
