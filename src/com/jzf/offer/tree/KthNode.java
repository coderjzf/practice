package com.jzf.offer.tree;

import java.util.ArrayList;

/*��Ŀ����
����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��*/
public class KthNode {
	static int count = 0;
	public static TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode node = KthNode(pRoot.left, k);
			if (node != null)
				return node;
			count++;
			if (count == k)
				return pRoot;
			node = KthNode(pRoot.right, k);
			if (node != null)
				return node;
		}
		return null;
	}

	public static TreeNode getKthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0)
			return null;
		return getKthNodeCore(pRoot, k);
	}

	public static TreeNode getKthNodeCore(TreeNode pRoot, int k) {
		TreeNode target = null;
		if (pRoot.left != null)
			target = getKthNodeCore(pRoot.left, k);
		if (target == null) {
			if (k == 1)
				target = pRoot;
			k--;
		}
		if (target == null && pRoot.right != null)
			target = getKthNodeCore(pRoot.right, k);
		return target;
	}

	public static void main(String[] args) {
		TreeNode pRoot = new TreeNode(10);
		TreeNode two = new TreeNode(8);
		TreeNode three = new TreeNode(5);
		TreeNode four = new TreeNode(12);
		pRoot.left = two;
		pRoot.right = four;
		two.left = three;
		TreeNode node = KthNode(pRoot, 4);
		System.out.println(node.val);

	}
}
