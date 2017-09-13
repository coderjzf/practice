package com.jzf.offer.tree;

/*
��Ŀ����
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5*/
public class Mirro {
	public void mirro(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		if (root.left != null)
			mirro(root.left);
		if (root.right != null)
			mirro(root.right);
	}
}
