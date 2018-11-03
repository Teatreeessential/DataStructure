package com.study.data_structure;

public class Node<T> {
	private Node left;
	private T data;
	private Node right;
	
	
	
	public Node(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	
	
	public Node getLeft() {
		return left;
	}



	public void setLeft(Node left) {
		this.left = left;
	}



	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}



	public Node getRight() {
		return right;
	}



	public void setRight(Node right) {
		this.right = right;
	}




	
	
	
}
