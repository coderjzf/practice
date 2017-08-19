package com.jzf.sort;

public class SortTest {
	private static final int[] INIT_ARRAY = { 25, 32, 99, 58, 11, 10, 45, 65, 32, 87, 12, 88, 66, 33 };

	private static final int[] ARRAY = { 9, 8, 7, 6, 5, 4, 3, 1, 2 };

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

	/**
	 * 快速排序 时间复杂度o(N*lgN) 不是稳定排序
	 */
	public static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int i = left;// 左边界
			int j = right;// 右边界
			int temp = a[i];// 基准数
			while (i < j) {
				while (i < j && a[j] >= temp)// 当i=j或a[j]<基准数时退出。即从右向左找小于基准数的数
					j--;
				if (i < j)// 若i<j成立，则将小于基准数的数放到基准数左边
					a[i++] = a[j];
				while (i < j && a[i] < temp)// 当i==j或a[i]>=基准数时退出。即从左向右找大于等于基准数的数
					i++;
				if (i < j)// 若i<j成立，则将大于等于基准数的数放到基准数右边
					a[j--] = a[i];
			}
			a[i] = temp;// 将基准数放入合适位置
			quickSort(a, left, i - 1);// 递归遍历基准数左边的数组
			quickSort(a, i + 1, right);// 递归遍历基准数右边的数组
		}
	}

	/**
	 * 非正宗冒泡排序:因为每次并不是相邻的数据之间比较大小
	 * 
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
	 * 
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

	public static void main(String[] args) {
		/*
		 * for (int i : INIT_ARRAY) { System.out.print(i + " "); }
		 * System.out.println(); binarySort(INIT_ARRAY); for (int i :
		 * INIT_ARRAY) { System.out.print(i + " "); }
		 */
		/*
		 * System.out.println(binarySearch(INIT_ARRAY, 0, INIT_ARRAY.length - 1,
		 * 66));
		 */

		// bubbleSort2(ARRAY);
		// primaryBubbleSort(INIT_ARRAY);
		// directInsertSort(INIT_ARRAY);
		shellSort2(ARRAY);
		for (int i : ARRAY) {
			System.out.print(i + " ");
		}
	}
}
