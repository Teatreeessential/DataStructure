package com.study.data_structure;

public class BinaryTree {
	
	public BinaryTree(){
	}
	
	public void makeleftsubtree(Node parent,Node child) {
		parent.setLeft(child);
	}
	public void makerightsubtree(Node parent,Node child) {
		parent.setRight(child);
	}
	public Node getleftsubtree(Node parent) {
		return parent.getLeft();
	}
	public Node getrightsubtree(Node parent) {
		return parent.getLeft();
	}
	
	public void preorder(Node node) {
		if(node==null) return;
		preorder(node.getLeft());
		preorder(node.getRight());
		System.out.println(node.getData());
		
		
	}
	public void inorder(Node node) {
		if(node==null) return;
		inorder(node.getLeft());
		System.out.println(node.getData());
		inorder(node.getRight());
		
	}
	public void postorder(Node node) {
		if(node==null) return;
		postorder(node.getLeft());
		postorder(node.getRight()); 
		System.out.println(node.getData());
		
		
	}
	
}
