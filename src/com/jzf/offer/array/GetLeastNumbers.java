package com.jzf.offer.array;

import java.util.ArrayList;

/*题目描述
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。*/
public class GetLeastNumbers {
	public  ArrayList<Integer> getLeastNumbers(int[] input, int k) {
		ArrayList<Integer> outPut = new ArrayList<>();
		if (input == null || input.length < k)
			return outPut;
		int low = 0;
		int high = input.length - 1;
		int index = partition(input, low, high);
		while (index != k - 1) {
			if (index > k - 1) {
				high = high - 1;
				index = partition(input, low, high);
			} else {
				low = low + 1;
				index = partition(input, low, high);
			}
		}
		for (int i = 0; i < k; i++) {
			outPut.add(input[i]);
		}
		return outPut;
	}

	public  void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("数组下标越界！");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public  int partition(int[] a, int low, int high) {
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
/*		int[] a = { 10, 5, 6, 8, 2, 10, 11, 3, 4, 7 };
		ArrayList<Integer> outPut = getLeastNumbers(a, 4);
		for (Integer i : outPut)
			System.out.print(i + " ");*/
	}
}
