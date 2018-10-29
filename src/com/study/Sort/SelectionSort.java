package com.study.Sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,9,2,8};
		SelectionSort selection = new SelectionSort();
		selection.Sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}
	public void Sort(int []arr) {
		int temp;
		
		
		
		for(int i=arr.length-1;i>=0;i--) {
			int greatest=0;
			int greatest_index=0;
			for(int j=i;j>=0;j--) {
				if(greatest<arr[j]) {
					greatest = arr[j];
					greatest_index = j;
				}
			}
			temp=arr[i];
			arr[i] = greatest;
			arr[greatest_index] = temp;
		}
	}

}
