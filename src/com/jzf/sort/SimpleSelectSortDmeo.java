package com.jzf.sort;

public class SimpleSelectSortDmeo {
	/**
	 * ��������a������i,j����ֵ
	 */
	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("�����±�Խ�磡");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * ��ѡ������ ˼��:ͨ��n�α�����������,��ÿ�α����õ�����С(�����)����������������Ŀ�ͷ(ĩβ)
	 * ��һ�α����õ���С�������������һ��λ��(���������γ�),ֱ��ȫ���������� ʱ�临�Ӷ�:o(n^2)
	 */
	public static void selectSort(int[] a) {
		int n = a.length;
		int minIndex = 0;
		for (int i = 0; i < n; i++) {
			minIndex = i;// ÿ�ο�ʼ�������飬����i��������С
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minIndex]) {// ���a[j]С����С��������¼������ֵj
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(a, minIndex, i);
			}
		}
	}
}
