package com.study.Sort;

public class test01 {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,9,2,8};
		test01 t1 =new test01();
		t1.quick(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public void quick(int[] arr,int start,int end) {
		int pivot = (start+end)/2;
		int temp;
		if(start>=end) {
			return;
		}
		
		while(start<=end) {
			while(arr[start]<arr[pivot]&&start<pivot) start++;
			while(arr[pivot]<arr[end]) end--;
			if(start<end) {
				temp =arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
					
			}
			
		}
		quick(arr,start,pivot-1);
		quick(arr,pivot+1,end);
		
	}

}
