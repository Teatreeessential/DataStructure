package com.study.search;

import com.study.data_structure.Node;

public class BinarySearchTree {
	
	public void insert_data(Node<Integer> root,int data) {
		Node<Integer> pnode =null;
		Node<Integer> cnode =root;
		Node<Integer> nnode =null;
		
		
		while(cnode!=null) {
			
			if(cnode.getData()==data) {
				System.out.println("각노드는 고유의 값을 가집니다.");
				return;
			}
			
			pnode = cnode;
			
			if(data<cnode.getData()) {
				cnode = cnode.getLeft();
			}else {
				cnode = cnode.getRight();
			}
		}
		nnode = new Node(data);
		
		if(data<pnode.getData()) {
			pnode.setLeft(nnode);
		}else {
			pnode.setRight(nnode);
		}
	}
	public void delete_node(Node<Integer> root,int data) {
		Node<Integer> pnode = search(root,data);
		
		if(pnode.getLeft()!=null&&pnode.getRight()!=null) {
			
		}else if(pnode.getLeft()!=null){
			
		}else if(pnode.getRight()!=null) {
			pnode.setData(pnode.getRight().getData());
		}else {
			pnode = null;
		}
		
	}
	public Node<Integer> search(Node<Integer> root,int target) {
		
		Node<Integer> cnode = root;
		
		while(cnode!=null){
			
			if(cnode.getData()==target) return cnode;
			
			if(target<cnode.getData()) {
				cnode = cnode.getLeft(); 
			}else {
				cnode = cnode.getRight();
			}
		}
		System.out.println("찾고자 하는 데이터가 없습니다.");
		return null;
	}
	
}
