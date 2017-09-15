package com.jzf.offer.stack;

import java.util.ArrayList;

/*
 ��Ŀ����
����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� 
�������{2,3,4,2,6,2,5,1}�Ļ�������������6���� 
{[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}��
 {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
*/
public class MaxInWindow {
	public static ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
/*		if (num == null || num.length == 0 || size < num.length)
			return result;*/
		int end = size - 1;
		for (int i = end; i < num.length; i++) {
			int max = num[i];
			for (int j = i - 2; j <= i; j++) {
				if (num[j] > max)
					max = num[j];
			}
			result.add(max);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		ArrayList<Integer> result = maxInWindows(num, 3);
		for (Integer i : result)
			System.out.println(i);
	}
}
