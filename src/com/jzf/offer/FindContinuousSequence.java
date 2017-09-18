package com.jzf.offer;

import java.util.ArrayList;

/*��Ŀ����
С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��*/
public class FindContinuousSequence {
	public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		if (sum < 3)
			return result;

		int small = 1;
		int big = 2;
		// ��Ϊ�����������ٰ��������� ����small���ӵ�middleΪֹ
		int middle = (1 + sum) / 2;
		int curSum = small + big;
		while (small < middle) {
			if (curSum < sum) {
				big++;
				curSum += big;
				continue;
			} else if (curSum > sum) {
				curSum -= small;
				small++;
				continue;
			}
			addList(result, small, big);
			big++;
			curSum+=big;
		}
		return result;
	}

	public static ArrayList<ArrayList<Integer>> addList(ArrayList<ArrayList<Integer>> result, int small, int big) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = small; i <= big; i++) {
			list.add(i);
		}
		result.add(list);
		return result;
	}
	public static void main(String[] args) {
		findContinuousSequence(9);
	}
}
