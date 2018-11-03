package com.study.Sort;

public class test02 {

	public static void main(String[] args) {
		int [] arr = {6,7,-1,0,3,2,10};
		mergesort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}

	}
	
	public static void mergesort(int[] arr,int start,int end) {
	// start 0 end 3
		if(start<end) {
			int mid = (start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			mergetwoarea(arr,start,mid,end);
		}
		
	}

	private static void mergetwoarea(int[] arr, int start, int mid, int end) {
		int []tmp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid+1;
		while(part1<=mid&&part2<=end) {
			if(tmp[part1]<tmp[part2]) {
				arr[start] = tmp[part1];
				part1++;
			}else {
				arr[start] = tmp[part2];
				part2++;
			}
			start++;
		}
		if(part1<=mid) {
			for(int i=part1;i<=mid;i++) {
				arr[start]=tmp[i];
				start++;
			}
		}
		
	}

}
