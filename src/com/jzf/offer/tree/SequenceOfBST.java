package com.jzf.offer.tree;

import java.util.Arrays;

/*��Ŀ����
����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
����������Yes,�������No��
�������������������������ֶ�������ͬ*/
public class SequenceOfBST {
	public static boolean verifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length <= 0)
			return false;

		int l = sequence.length - 1;
		int root = sequence[l];

		/* �������Ľ��ֵ��С�ڸ���㣬�ҳ������� */
		int i = 0;
		for (; i < l; i++) {
			if (sequence[i] > root)
				break;
		}

		/* �������Ľ��ֵ�����ڸ���㣬����˵�����Ǻ���������� */
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
