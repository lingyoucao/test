package com.composite;

public class Test {

	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.setName("¸ù½Úµã");
		
		TreeNode node1 = new TreeNode("1");
		TreeNode node2 = new TreeNode("2");
		TreeNode node3 = new TreeNode("3");
		
		root.add(node1);
		root.add(node2);
		root.add(node3);
		
		TreeNode node11 = new TreeNode("11");
		TreeNode node12 = new TreeNode("12");
		TreeNode node13 = new TreeNode("13");
		node1.add(node11);
		node1.add(node12);
		node1.add(node13);
		
		TreeNode node21 = new TreeNode("21");
		TreeNode node22 = new TreeNode("22");
		node2.add(node21);
		node2.add(node22);
		
		System.out.println(root);
		
	}

}
