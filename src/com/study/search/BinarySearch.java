package com.study.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarysearch(int[] arr ,int key) {
		int pl = 0;
		int pr = arr.length-1;
		
		do{
			int pc = pr+pl/2;
			
			if(arr[pc] == key) {
				return 1;
			}else if(arr[pc] > key) {
				pr = pc-1;
				
			}else {
				pl = pc+1;
				
			}
		}while(pl<=pr);
		
			return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+" ��° �迭�� �Է����ּ���:");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("ã���� �ϴ� ���� �Է� ���ּ���:");
		int search_num = sc.nextInt();
		if(binarysearch(arr,search_num)==1) {
			System.out.println(search_num+"ã�ҽ��ϴ�.");
		}else {
			System.out.println("�ش��ϴ� ���� �迭�� �������� �ʽ��ϴ�.");
		}
		
	}

}
