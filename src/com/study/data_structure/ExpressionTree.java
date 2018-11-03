package com.study.data_structure;

import java.util.Stack;

public class ExpressionTree {
	Stack stack = new Stack<>();
	BinaryTree tree = new BinaryTree();
	Node node;
	
	public void make_expression_tree(String expression) {
		String[] arr = expression.split("");
		for(String s:arr) {
			Node<String> node = new Node(s); 
			if(isNum(s)) {
				stack.push(node);
			}else {
				node.setRight((Node)stack.pop());
				node.setLeft((Node)stack.pop());
				stack.push(node);
			}
			
		}
		this.node=(Node)stack.pop();
	}
	public boolean isNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	public void preordershow() {
		tree.preorder(node);
	}
	public void inerordershow() {
		tree.inorder(node);
	}
	public void postordershow() {
		tree.postorder(node);
	}
	
	public int evaluate_exp_tree(Node<String> node) {
		int op1,op2;
		if(node.getLeft()==null&&node.getRight()==null) {
			return Integer.parseInt(node.getData());
		}
		
		op1 = evaluate_exp_tree(node.getLeft());
		op2 = evaluate_exp_tree(node.getRight());
		
		switch(node.getData()){
			case "+":
				return op1+op2;
			case "-":
				return op1-op2;
			case "*":
				return op1*op2;
			case "/":
				return op1/op2;
		}
		return 0;
	}
	
	
}
