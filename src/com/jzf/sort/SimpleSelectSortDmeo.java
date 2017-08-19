package com.jzf.sort;

public class SimpleSelectSortDmeo {
	/**
	 * 交换数组a中索引i,j处的值
	 */
	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("数组下标越界！");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * 简单选择排序 思想:通过n次遍历无序数组,将每次遍历得到的最小(或最大)的数放在有序数组的开头(末尾)
	 * 第一次遍历得到最小的数放在数组第一个位置(有序数组形成),直到全部数据有序 时间复杂度:o(n^2)
	 */
	public static void selectSort(int[] a) {
		int n = a.length;
		int minIndex = 0;
		for (int i = 0; i < n; i++) {
			minIndex = i;// 每次开始遍历数组，假设i处的数最小
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minIndex]) {// 如果a[j]小于最小的数，记录下索引值j
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(a, minIndex, i);
			}
		}
	}
}
