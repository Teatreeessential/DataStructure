package com.study.data_structure;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
	enum type{
		A,B,C,D
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�");
		int n = sc.nextInt();
		System.out.println("������ ������ �Է��Ͻÿ�");
		int m = sc.nextInt();
		
		ArrayList<ArrayList<Graph>> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Graph>());
		}
		for(int i=0;i<m;i++) {
			System.out.print("�ش� ������ �������?");
			int start = sc.nextInt();
			System.out.print("�ش� ������ �� ����?");
			int end = sc.nextInt();
			System.out.print("�ش� ������ ����ġ?");
			int weight = sc.nextInt();
			
			Graph gp1 = new Graph(weight, end);
			list.get(start).add(gp1);
			Graph gp2 = new Graph(weight, start);
			list.get(end).add(gp2);
			
		}
		for(int i=0;i<list.size();i++) {
			for(Graph g:list.get(i)) {
				System.out.println(i+"-"+g.end+"weigh��"+g.weight);
			}
		}
		
		
		

	}
	
	

}
