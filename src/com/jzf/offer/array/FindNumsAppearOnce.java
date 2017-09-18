package com.jzf.offer.array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*题目描述
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。*/
public class FindNumsAppearOnce {
	public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length == 0)
			return;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], 2);
			}
		}

		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			Integer value = entry.getValue();
			if (value == 1 && num1[0] == 0) {
				num1[0] = entry.getKey();
			} else if (value == 1 && num1[0] != 0) {
				num2[0] = entry.getKey();
			}
		}
	}

	/* 用异或的方法 两个相同的数异或等于0 一个数与0异或等于本身 */

	public static void findNumsAppearOnce2(int[] array, int[] num1, int[] num2) {
		int result = 0;
		// 求出依次异或的结果
		// 由于相同的两个数异或的结果为0 所以此结果是两个只出现依次的数异或的结果
		for (int i : array) {
			result ^= i;
		}

		// 找到异或的结果中从右往左第一个1的位置
		int indexOfBitIs1 = findIndexOfBitIs1(result);

		// 根据从右往左n位为1或0，将数组分为两类
		// 每一类中有一个只出现一次的数和若干对出现两次的数
		for (int i : array) {
			if (isBit1(i, indexOfBitIs1)) {
				num1[0] ^= i;
			} else {
				num2[0] ^= i;
			}
		}
	}

	public static int findIndexOfBitIs1(int num) {
		int flag = 1;
		int count = 0;
		while (flag != 0) {
			count++;
			if ((num & flag) != 0) {
				break;
			}
			flag = flag << 1;
		}
		return count;
	}

	public static boolean isBit1(int num, int indexOfBitIs1) {
		int flag = 1;
		flag = flag << indexOfBitIs1 - 1;
		if ((num & flag) != 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		/*
		 * int[] array = { 1, 1, 2, 3, 4, 4, 5, 5, 6, 2, 6, 8 }; int[] num1 =
		 * new int[1]; int[] num2 = new int[1]; findNumsAppearOnce(array, num1,
		 * num2); System.out.println(num1[0] + " " + num2[0]);
		 */
		int[] array = { 1, 1, 2, 3, 4, 4,2,5};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		findNumsAppearOnce2(array,num1,num2);
		System.out.println(num1[0]+" "+num2[0]);
	}
}
