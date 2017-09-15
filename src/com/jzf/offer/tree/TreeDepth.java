package com.jzf.offer.tree;

/*题目描述
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。*/
public class TreeDepth {
	/**
	 * 树的深度等于左右子树深度较大者的深度+1
	 */
	public int treeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int depthLeft = treeDepth(root.left);
		int depthRight = treeDepth(root.right);
		return depthLeft > depthRight ? depthLeft + 1 : depthRight + 1;
	}
}
