package com.jzf.offer.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*题目描述
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。*/
public class LevelTraversal {
	
	/*从上到下 按层 打印二叉树*/
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		Deque<TreeNode> deque = new ArrayDeque<>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> level = new ArrayList<>();

		if (pRoot == null)
			return result;

		deque.offerLast(pRoot);
		int start = 0, end = 1;
		while (!deque.isEmpty()) {
			TreeNode node = deque.pollFirst();// 在队列头部取出元素

			level.add(node.val);
			start++;

			// 将结点的左右孩子依次入队列
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
	
	/*从上往下打印二叉树*/
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
