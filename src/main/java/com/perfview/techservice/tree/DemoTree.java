package com.perfview.techservice.tree;

public class DemoTree {

	public static void main(String args[]) {
		
		//int[] values =  { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, -1 };
		int[] values =  { 1, 2, -1, -1, -1 };
		BinaryTree binaryTree = new BinaryTree();

		TreeNode treeNode = binaryTree.buildTree(values);

		//System.out.println("Root Value " + treeNode.getValue());
		
		binaryTree.preOrder(treeNode);
		binaryTree.inOrder(treeNode);
		binaryTree.postOrder(treeNode);
	}
}
