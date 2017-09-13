package com.jzf.offer.tree;

import java.util.ArrayList;

/*题目描述
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。*/
public class FindPathInTree {
	/*
	 * 1.前序遍历二叉树，并将结点依次入栈，计算路径和 
	 * 2.若到达叶节点且路径和等于期望值，则打印路径 
	 * 3.若不满足2的条件，继续前序遍历
	 * 4.将当前节点从路径中删除(出栈)，返回当前节点的父节点
	 */
	private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	private ArrayList<Integer> path = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {

		if (root == null)
			return result;

		target -= root.val;
		path.add(root.val);

		boolean isLeaf = root.left == null && root.right == null;

		if (target == 0 && isLeaf == true)
			// 重新new一个ArrayList,否则最终result中的元素都指向了同一个ArrayList
			result.add(new ArrayList<>(path));

		findPath(root.left, target);
		findPath(root.right, target);

		path.remove(path.size() - 1);

		return result;
	}

}
