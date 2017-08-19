package com.jzf.sort;

public class ShellSortDemo {
	/**
	 * 希尔排序 最好的情况下时间复杂度o(n^(3/2)) 由于是跳跃式的，所以是非稳定排序
	 * 
	 * @param a
	 */
	public static void shellSort2(int[] a) {
		int n = a.length;
		int gap = 0;
		int i = 0;
		int j = 0;
		int temp = 0;

		for (gap = n / 2; gap >= 1; gap /= 2) {//增量从n/2->1 最后一个增量值必须为1
			for (i = gap; i < n; i++) {
				if (a[i] < a[i - gap]) {//如果同组内后一个数小于前一个数
					temp = a[i];//保存需要进行插入操作的数
					for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
						a[j + gap] = a[j];
					}
					a[j + gap] = temp;
				}
			}
		}
	}
}
