package com.study.data_structure;

import java.lang.reflect.Array;

public class Heap{
	private int[] arr;
	private int priority;
	private int count = 0;
	private comp comp;
	
	public void heap_init(int heap_size,comp comp) {
		arr = new int[heap_size];
		comp = comp;
	}
	public boolean heap_is_empty() {
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	public void heap_insert(int data) {
		count++;
		int temp_index = count;
		while(temp_index>1) {
			int root = temp_index/2;
			comp(arr[root],arr[temp_index]);
			
		}
	}
	public T heap_delete() {
		
	}
	
	
	
}
