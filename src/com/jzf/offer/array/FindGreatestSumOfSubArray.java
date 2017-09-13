package com.jzf.offer.array;

/*连续最大子数组之和
 *动态规划入门
 */
public class FindGreatestSumOfSubArray {
	public static int findGreatestSumOfSubArray(int[] array) {
		int sum = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (sum >= 0) {
				sum += array[i];
			} else {
				sum = array[i];
			}
			if (max < sum)
				max = sum;
		}
		return max;
	}
}
