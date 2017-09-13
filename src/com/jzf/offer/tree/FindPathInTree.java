package com.jzf.offer.tree;

import java.util.ArrayList;

/*��Ŀ����
����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����*/
public class FindPathInTree {
	/*
	 * 1.ǰ��������������������������ջ������·���� 
	 * 2.������Ҷ�ڵ���·���͵�������ֵ�����ӡ·�� 
	 * 3.��������2������������ǰ�����
	 * 4.����ǰ�ڵ��·����ɾ��(��ջ)�����ص�ǰ�ڵ�ĸ��ڵ�
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
			// ����newһ��ArrayList,��������result�е�Ԫ�ض�ָ����ͬһ��ArrayList
			result.add(new ArrayList<>(path));

		findPath(root.left, target);
		findPath(root.right, target);

		path.remove(path.size() - 1);

		return result;
	}

}
