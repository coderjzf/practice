package com.jzf.offer.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*��Ŀ����
���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�*/
public class LevelTraversal {
	
	/*���ϵ��°����ӡ������*/
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		Deque<TreeNode> deque = new ArrayDeque<>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> level = new ArrayList<>();

		if (pRoot == null)
			return result;

		deque.offerLast(pRoot);
		int start = 0, end = 1;
		while (!deque.isEmpty()) {
			TreeNode node = deque.pollFirst();// �ڶ���ͷ��ȡ��Ԫ��

			level.add(node.val);
			start++;

			// ���������Һ������������
			if (node.left != null)
				deque.offerLast(node.left);
			if (node.right != null)
				deque.offerLast(node.right);

			if (start == end) {
				start = 0;
				end = deque.size();
				result.add(level);
				level = new ArrayList<>();
			}
		}
		return result;
	}
	
	/*�������´�ӡ������*/
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        
        if(root==null)
            return result;
        
        list.add(root);
        while(list.size()!=0){
            TreeNode node = list.remove();
            result.add(node.val);
            
            if(node.left!=null)
                list.add(node.left);
            if(node.right!=null)
                list.add(node.right);
        }
        return result;
    }
}
