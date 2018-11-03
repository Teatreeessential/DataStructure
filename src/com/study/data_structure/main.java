package com.study.data_structure;

public class main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node<Integer> root = new Node(0);
		Node<Integer> node1 = new Node(1);
		Node<Integer> node2 = new Node(2);
		Node<Integer> node3 = new Node(3);
		Node<Integer> node4 = new Node(4);
		Node<Integer> node5 = new Node(5);
				
		
		tree.makeleftsubtree(root, node1);
		tree.makerightsubtree(root, node2);
		tree.makeleftsubtree(node1, node3);
		tree.makerightsubtree(node1, node4);
		tree.makeleftsubtree(node2, node5);
	
		
		ExpressionTree exp = new ExpressionTree();
		exp.make_expression_tree("12+7*");
		exp.inerordershow();
		System.out.println(exp.evaluate_exp_tree(exp.node));

	}
	
	

}
