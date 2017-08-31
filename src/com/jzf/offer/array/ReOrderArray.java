package com.jzf.offer.array;

import java.util.ArrayList;

/*��Ŀ����
����һ���������飬ʵ��һ�����������������������ֵ�˳��
ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
����֤������������ż����ż��֮������λ�ò��䡣*/
public class ReOrderArray {
	public void reOrderArray(int[] array) {
		if (array == null) {
			throw new NullPointerException("array is null");
		}
		int temp = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				temp = array[i];
				System.arraycopy(array, i + 1, array, i, n - i - 1);
				array[n - 1] = temp;
			}
		}
	}

	public static void reOrderArray2(int[] array) {
		ArrayList<Integer> event = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				odd.add(array[i]);
			} else if (array[i] % 2 == 0) {
				event.add(array[i]);
			}
		}
		odd.addAll(event);
		for (int i = 0; i < array.length; i++) {
			array[i] = odd.get(i);
		}
	}

	public static void reOrderArray3(int[] array) {
		int front = 0;
		int behind = array.length - 1;
		while (behind > front) {
			while (behind > front && array[front]%2 == 1)
				front++;
			while (behind > front && array[behind]%2 == 0)
				behind--;
			if (behind > front) {
				int temp = array[front];
				array[front] = array[behind];
				array[behind] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray3(array);
	}
}
