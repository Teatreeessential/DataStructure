package com.study.data_structure;

public class PriorityQueue {
	
	Heap heap = new Heap();
	
	public void pq_init(int size,DataPriority dp) {
		heap.heap_init(size, dp);
	}
	
	public boolean pq_is_empty() {
		return heap.heap_is_empty();
	}
	public void enqueue(int data) {
		heap.heap_insert(data);
	}
	public int dequeue() {
		return heap.heap_delete();
	}
}
