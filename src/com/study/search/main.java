package com.study.search;

import com.study.data_structure.Node;

public class main {

	public static void main(String[] args) {
		Node<Integer> root = new Node<>(5);
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert_data(root, 1);
		bt.insert_data(root, 2);
		System.out.println(bt.search(root, 1).getData());
		System.out.println(bt.search(root, 7).getData());
		
	}

}
