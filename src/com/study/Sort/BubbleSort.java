package com.study.Sort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {4,2,5,3,6,7};
		BubbleSort bubble = new BubbleSort();
		bubble.Sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}
	public void Sort(int []arr) {
		int temp;
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
