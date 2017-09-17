package com.jzf.offer.array;

/*题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。*/
public class GetMoreThanHalfNumber {
	public static int getMoreThanHalfNumber(int[] array) {
		if (array == null)
			return 0;
		int low = 0;
		int high = array.length - 1;
		int index = partition(array, low, high);
		int middle = array.length / 2;
		/**
		 * 出现次数超过数组长度一半的数，则"排序"后数组中位数就是满足条件的那个数
		 * 利用partition函数，选取基准值pivotkey，使得基准值左边的数都小于等于它，基准值右边的数都大于等于它
		 * 如果得到的基准值的索引小于middle,则中位数位于基准值右边，继续在右边查找
		 * 如果得到的基准值的所有大于middle,则中位数位于基准值左边，继续在左边查找
		 */
		while (index != middle) {
			if (index < middle) {
				low = low + 1;
				index = partition(array, low, high);
			} else {
				high = high - 1;
				index = partition(array, low, high);
			}
		}
		int result = array[middle];
		if (!checkIfMoreThanHalf(array, result))
			return 0;
		return result;
	}

	public static boolean checkIfMoreThanHalf(int[] array, int num) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				count++;
		}
		if (count <= array.length / 2)
			return false;
		return true;
	}

	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("数组下标越界！");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int low, int high) {
		int pivotkey = a[low];

		while (low < high) {
			while (low < high && a[high] >= pivotkey)
				high--;
			swap(a, low, high);
			while (low < high && a[low] <= pivotkey)
				low++;
			swap(a, low, high);
		}

		return low;
	}
	public static void main(String[] args) {
		int[] array = {5,2,2,3,4,2,2,2,2};
		System.out.println(getMoreThanHalfNumber(array));
	}
}
