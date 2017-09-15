package com.jzf.offer.tree;

/*��Ŀ����
����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�*/
public class TreeDepth {
	/**
	 * ������ȵ�������������Ƚϴ��ߵ����+1
	 */
	public int treeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int depthLeft = treeDepth(root.left);
		int depthRight = treeDepth(root.right);
		return depthLeft > depthRight ? depthLeft + 1 : depthRight + 1;
	}
}
