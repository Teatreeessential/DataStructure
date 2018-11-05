package com.study.data_structure;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
	enum type{
		A,B,C,D
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정점의 갯수를 입력하시오");
		int n = sc.nextInt();
		System.out.println("간선의 갯수를 입력하시오");
		int m = sc.nextInt();
		
		ArrayList<ArrayList<Graph>> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Graph>());
		}
		for(int i=0;i<m;i++) {
			System.out.print("해당 간선의 출발지점?");
			int start = sc.nextInt();
			System.out.print("해당 간선의 끝 지점?");
			int end = sc.nextInt();
			System.out.print("해당 간선의 가중치?");
			int weight = sc.nextInt();
			
			Graph gp1 = new Graph(weight, end);
			list.get(start).add(gp1);
			Graph gp2 = new Graph(weight, start);
			list.get(end).add(gp2);
			
		}
		for(int i=0;i<list.size();i++) {
			for(Graph g:list.get(i)) {
				System.out.println(i+"-"+g.end+"weigh는"+g.weight);
			}
		}
		
		
		

	}
	
	

}
