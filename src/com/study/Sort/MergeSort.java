package com.study.Sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {3,2,1,4};
		MergeSort merge = new MergeSort();
		merge.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public void sort(int[] arr) {
		int[] tmp = new int[arr.length];
		sort(arr,tmp,0,arr.length-1);
	}
	
	public void sort(int[] arr,int[] tmp,int start,int end) {
		if(end>start) {
			int q = (start+end)/2;
			sort(arr,tmp,start,q);
			sort(arr,tmp,q+1,end);
			merge(arr,tmp,start,q,end);
			
		}
	}
	public void merge(int[] arr,int[] tmp,int start,int mid ,int end) {
		for(int i=start;i<arr.length;i++) {
			tmp[i] = arr[i];
		}
		int index = start;
		int part1 = start;
		int part2 = mid+1;
		while(part1<=mid&&part2<=end) {
			if(tmp[part1]<=tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for(int i=0;i<=mid-part1;i++) {
			arr[index+i] = tmp[part1+i];
		}
	}

}
