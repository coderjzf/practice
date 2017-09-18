package com.jzf.offer;

import java.util.ArrayList;

/*输入一个递增排序的数组和一个数字S，在数组中查找两个数，使的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。*/
public class FindNumbersWithSum {
	/*时间复杂度o(n)*/
	public static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> outPut = new ArrayList<>();
		if (array == null || array.length == 0 || sum < 0)
			return outPut;

		int small = 0;
		int big = array.length - 1;
		while (small < big) {
			int result = array[small] + array[big];
			if (result == sum) {
				if (!outPut.isEmpty()) {
					// 如果乘积较大 则继续循环
					if (outPut.get(0) * outPut.get(1) <= array[small] * array[big]) {
						small++;
						continue;
					} else {
						outPut.remove(0);
						outPut.remove(0);
					}
				}
				outPut.add(array[small]);
				outPut.add(array[big]);
				small++;
			} else if (result > sum) {
				big--;
			} else {
				small++;
			}
		}
		return outPut;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayList<Integer> output = findNumbersWithSum(array, 7);
		System.out.print(output.get(0)+" "+output.get(1));
	}
}
