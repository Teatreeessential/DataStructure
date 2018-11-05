package com.study.Sort;

import com.study.data_structure.DataPriority;
import com.study.data_structure.Heap;

public class HeapSort {
	public static void main(String []args) {
		int []arr = {4,6,2,1};
		Heap heap = new Heap();
		DataPriority dp = (data1,data2) -> data2-data1;
		heap.heap_init(arr.length, dp);
		for(int i:arr) {
			heap.heap_insert(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(heap.heap_delete());
		}
		
	}
	
}
