package com.study.data_structure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap{
	private int[] arr;
	private int count = 0;
	private DataPriority data_priority;
	
	public void heap_init(int heap_size,DataPriority dp) {
		arr = new int[heap_size+1];
		data_priority = dp;
	}
	public boolean heap_is_empty() {
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	public void swap(int arr[],int idx1,int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	public boolean leftisNull(int parent) {
		int left_idx = parent*2;
		if(left_idx<=count) {
			return false;			
		}else {
			return true;
		}
		
	}
	public boolean rightisNull(int parent) {
		int right_idx= parent*2+1;
		if(right_idx<=count) {
			return false;			
		}else {
			return true;
		}
	}
	public int who_priority(int idx1,int idx2) {
		int priority = data_priority.comp(arr[idx1],arr[idx2]);
		if(priority>=0){
			return idx1;
		}else {
			return idx2;
		}
	}
	public void show_heap() {
		for(int i=1;i<arr.length;i++) {
			System.out.println(i+"노드의 데이터는"+arr[i]);
		}
	}
	public void heap_insert(int data) {
		count++;
		int temp_index = count;
		int priority;
		arr[temp_index] = data;
		while(temp_index>1) {
			int root = temp_index/2;
			priority = data_priority.comp(arr[root], arr[temp_index]);
			if(priority>=0) {
				temp_index = 1;
			}else {
				swap(arr,root,temp_index);
				temp_index=root;
			}
		}
		
	}
	public int heap_delete() {
		int temp_index = 1;
		int pop_num = arr[1];
		arr[1] = arr[count];
		arr[count] = 0;
		int priority_idx;
		if(heap_is_empty()) {
			System.out.println("힙 안에 아무런 자료가 존재 하지 않습니다.");
		}else{
			count--;
			while(!leftisNull(temp_index)) {
				if(!rightisNull(temp_index)) {
					priority_idx = who_priority(temp_index*2, temp_index*2+1);
					priority_idx = who_priority(priority_idx,temp_index);
					if(temp_index == priority_idx) {
						break;
					}else {
						swap(arr,temp_index,priority_idx);
						temp_index=priority_idx;
					}
				}else {
					priority_idx = who_priority(temp_index*2,temp_index);
					if(temp_index == priority_idx) {
						break;
					}else {
						swap(arr,temp_index,priority_idx);
						temp_index=priority_idx;
					}
				}
			
			
			}
		}
		
		return pop_num;
		
	}
	
	
	
}
