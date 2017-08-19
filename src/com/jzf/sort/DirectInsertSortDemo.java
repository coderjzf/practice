package com.jzf.sort;

public class DirectInsertSortDemo {

	
	/**
	 * ֱ�Ӳ������� ʱ�临�Ӷ�o(n^2) �ȶ�����:��ԭʼ����ʱa[i]=a[j],a[i]��a[j]֮ǰ;�����,a[i]����a[j]֮ǰ
	 */
	public static void directInsertSort(int[] a) {
		int n = a.length;
		int i, j, temp = 0;
		for (i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				temp = a[i];// ������Ҫ�������
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];// ����ƶ�һλ
				}
				a[j + 1] = temp;
			}
		}
	}
}
