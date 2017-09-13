package com.jzf.offer.tree;

/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/
public class SubTree {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean flag = false;
		/*两棵树不全为空*/
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val)
				flag = doesTree1HasTree2(root1, root2);
			if (!flag)
				flag = HasSubtree(root1.left, root2);
			if (!flag)
				flag = HasSubtree(root1.right, root2);
		}
		return flag;
	}

	public boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
	}
}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}
}