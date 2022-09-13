package com.core.tree;

public class BinaryTree {

	int index = -1;

	public TreeNode buildTree(int[] values) {
		index++;

		if (values[index] == -1 ) {
			return null;
		}
		
		TreeNode treeNode = new TreeNode(values[index]);
		treeNode.setLeftNode( buildTree(values));
		treeNode.setRightNode(buildTree(values));

		return treeNode;
	}

	public void preOrder(TreeNode root) {
		
		if(root == null) {
			return ;
		}
		
		System.out.println(root.getValue());
		preOrder(root.getLeftNode());
		preOrder(root.getRightNode());
		
	}
	

	public void inOrder(TreeNode root) {
		
		if(root == null) {
			return ;
		}
		
		inOrder(root.getLeftNode());
		System.out.println(root.getValue());
		inOrder(root.getRightNode());
		
	}
	
	public void postOrder(TreeNode root) {
		
		if(root == null) {
			return ;
		}
		
		inOrder(root.getLeftNode());
		inOrder(root.getRightNode());

		System.out.println(root.getValue());		
	}
}
