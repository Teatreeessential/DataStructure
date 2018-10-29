package com.study.Sort;

public class InsertionSort {
	public static void main(String args[]) {
		int []arr = {2,5,4,1,7};
		InsertionSort insertion  = new InsertionSort();
		insertion.Sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public void Sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int standard = arr[i];
			int aux = i-1;
			while(aux>=0&&standard<arr[aux]) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = standard;	
		}
	}
}
