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
			System.out.print((i+1)+" 번째 배열을 입력해주세요:");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("찾고자 하는 값을 입력 해주세요:");
		int search_num = sc.nextInt();
		if(binarysearch(arr,search_num)==1) {
			System.out.println(search_num+"찾았습니다.");
		}else {
			System.out.println("해당하는 값은 배열에 존재하지 않습니다.");
		}
		
	}

}
