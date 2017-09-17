package com.jzf.offer.array;

/*题目描述
统计一个数字在排序数组中出现的次数。k为输入的数*/
public class GetNumberOfK {
	public static int getNumberOfK(int[] array, int k) {
		if (array == null || array.length == 0)
			return -1;
		int count = 0;
		int first = getFirstK(array, k, 0, array.length - 1);
		int last = getLastK(array, k, 0, array.length - 1);
		if (first != -1 && last != -1)
			count = last - first + 1;
		return count;
	}

	// 找到第一次出现的位置
	public static int getFirstK(int[] array, int k, int start, int end) {
		if (start > end)
			return -1;

		int middle = (start + end) / 2;
		if (array[middle] < k) {
			start = middle + 1;
		} else if (array[middle] > k) {
			end = middle - 1;
		} else {
			if (middle > 0 && array[middle - 1] == k) {
				end = middle - 1;
			} else {
				return middle;
			}
		}
		return getFirstK(array, k, start, end);
	}

	// 找到最后一次出现的位置
	public static int getLastK(int[] array, int k, int start, int end) {
		if (start > end)
			return -1;

		int middle = (start + end) / 2;
		if (array[middle] < k) {
			start = middle + 1;
		} else if (array[middle] > k) {
			end = middle - 1;
		} else {
			if (middle < end && array[middle + 1] == k) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return getLastK(array, k, start, end);
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 5, 5, 5, 5 };
		System.out.println(getNumberOfK(array, 5));
	}
}
