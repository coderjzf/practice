package com.jzf.sort;

public class DirectInsertSortDemo {

	
	/**
	 * 直接插入排序 时间复杂度o(n^2) 稳定排序:即原始排序时a[i]=a[j],a[i]在a[j]之前;排序后,a[i]仍在a[j]之前
	 */
	public static void directInsertSort(int[] a) {
		int n = a.length;
		int i, j, temp = 0;
		for (i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				temp = a[i];// 保存需要插入的数
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];// 向后移动一位
				}
				a[j + 1] = temp;
			}
		}
	}
}
