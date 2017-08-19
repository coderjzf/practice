package com.jzf.sort;

public class BubbleSortDemo {
	
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
	 * 非正宗冒泡排序:因为每次并不是相邻的数据之间比较大小
	 * @param a
	 */
	public static void primaryBubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {// n次循环，每次将第i大/小的数放到i的位置
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
	}

	/**
	 * 冒泡排序 时间复杂度o(n^2) 稳定排序:是
	 */
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {// 第n次遍历数组，会将第n大/小的数排好序
				if (a[j] > a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}

	/**
	 * 冒泡排序优化:当数据有序后，不在进行多余的循环
	 * @param a
	 */
	public static void bubbleSort2(int[] a) {
		int n = a.length;
		boolean flag = true;
		for (int i = 0; i < n && flag; i++) {
			flag = false;
			for (int j = n - 1; j > i; j--) {
				if (a[j] > a[j - 1]) {
					swap(a, j, j - 1);
					flag = true;
				}
			}
		}
	}
}
