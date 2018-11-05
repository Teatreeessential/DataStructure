package com.study.search;

public class BSearchRecur {
	public static void main(String []args) {
		
		int arr[] = {1,3,5,7,9};
		int idx;
		
		idx = search(arr,0,arr.length-1,10);
		
		if(idx == -1) {
			System.out.println("Å½»ö ½ÇÆĞ");
		}else {
			System.out.println("Ã£´Â ÀÎµ¦½º:"+idx);
		}
		
	}
	public static int search(int []arr,int first,int last,int target) {
		
		
		
		if(first>last) {
			return -1;
		}
		int mid = (int)((double)(target-arr[first])/(arr[last]-arr[first])*(last-first))+first;
		
		if(target==arr[mid]) {
			return mid;
		}else if(target<arr[mid]) {
			return search(arr,first,mid-1,target);
		}else {
			return search(arr,mid+1,last,target);
		}
	}
}
