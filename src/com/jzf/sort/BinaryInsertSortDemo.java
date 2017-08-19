package com.jzf.sort;

public class BinaryInsertSortDemo {
	/**
	 * 二分查找
	 */
	public static int binarySearch(int[] a, int start, int end, int b) {
		int middle;
		while (start <= end) {
			middle = (start + end) / 2;
			if (b < a[middle]) {
				end = middle - 1;
			} else if (b > a[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return 0;
	}

	/**
	 * 二分插入排序 时间复杂度:o(n^2) 是稳定排序算法
	 */
	public static void binarySort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int insertIndex = binarySearch(a, 0, i - 1, a[i]);
			int j;
			for (j = i - 1; j >= insertIndex; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}
}
