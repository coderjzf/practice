package com.jzf.sort;

public class ShellSortDemo {
	/**
	 * ϣ������ ��õ������ʱ�临�Ӷ�o(n^(3/2)) ��������Ծʽ�ģ������Ƿ��ȶ�����
	 * 
	 * @param a
	 */
	public static void shellSort2(int[] a) {
		int n = a.length;
		int gap = 0;
		int i = 0;
		int j = 0;
		int temp = 0;

		for (gap = n / 2; gap >= 1; gap /= 2) {//������n/2->1 ���һ������ֵ����Ϊ1
			for (i = gap; i < n; i++) {
				if (a[i] < a[i - gap]) {//���ͬ���ں�һ����С��ǰһ����
					temp = a[i];//������Ҫ���в����������
					for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
						a[j + gap] = a[j];
					}
					a[j + gap] = temp;
				}
			}
		}
	}
}
