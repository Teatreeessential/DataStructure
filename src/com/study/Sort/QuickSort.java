package com.study.Sort;

public class QuickSort {
	public static void main(String[] args) {
		int []arr = {3,9,4,7,5,0,1,6,8,2};
		QuickSort q = new QuickSort();
		q.quicksort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public void quicksort(int []arr) {
		quicksort(arr,0,arr.length-1);
	}
	public void quicksort(int []arr,int start,int end) {
			int part2 = partition(arr,start,end);
			if(start<part2-1) {
				quicksort(arr,start,part2-1);
			}
			if(part2<end) {
				quicksort(arr,part2,end);
			}
	}
	public int partition(int[] arr,int start,int end) {
		int pivot = arr[(start+end)/2];
		while(start<=end) {
			while(arr[start]<pivot) start++;
			while(arr[end]>pivot) end--;
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;
			}
			
		}
		return start;
		
	}

	private void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}
}
