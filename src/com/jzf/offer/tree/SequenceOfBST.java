package com.jzf.offer.tree;

import java.util.Arrays;

/*题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。
假设输入的数组的任意两个数字都互不相同*/
public class SequenceOfBST {
	public static boolean verifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length <= 0)
			return false;

		int l = sequence.length - 1;
		int root = sequence[l];

		/* 左子树的结点值都小于根结点，找出左子树 */
		int i = 0;
		for (; i < l; i++) {
			if (sequence[i] > root)
				break;
		}

		/* 右子树的结点值都大于根结点，否则，说明不是后序遍历序列 */
		int j = i;
		for (; j < l; j++) {
			if (sequence[j] < root)
				return false;
		}

		boolean left = true;
		if (i > 0) {
			int[] sequenceLeft = Arrays.copyOfRange(sequence, 0, i);
			left = verifySquenceOfBST(sequenceLeft);
		}

		boolean right = true;
		if (i < l) {
			int[] sequenceRight = Arrays.copyOfRange(sequence, i, l);
			right = verifySquenceOfBST(sequenceRight);
		}

		return left && right;
	}
	
	public static void main(String[] args) {
		int[] a = {4,8,6,12,16,14,10};
		verifySquenceOfBST(a);
	}
}
