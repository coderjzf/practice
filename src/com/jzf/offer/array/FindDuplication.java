package com.jzf.offer.array;

import java.util.HashMap;

/*
 题目描述
在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 数组中某些数字是重复的，但不知道有几个数字是重复的。
 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class FindDuplication {
	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// 这里要特别注意~返回任意重复的一个，赋值duplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	// otherwise false
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean flag = false;
		for (int i = 0; i < length; i++) {
			if (!map.containsKey(numbers[i])) {
				map.put(numbers[i], i);
			} else {
				duplication[0] = numbers[i];
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static boolean duplicate2(int numbers[], int length, int[] duplication) {
		if (numbers == null || length == 0)
			return false;

		for (int i = 0; i < length; i++) {
			if (numbers[i] < 0 || numbers[i] > length - 1)
				return false;
		}

		boolean flag = false;
		for (int i = 0; i < length; i++) {
			// 如果第i位数不等于i
			while (numbers[i] != i) {
				// 如果第i位数m=numbers[i]等于第m位上的数，则找到重复数字
				if (numbers[i] == numbers[numbers[i]]) {
					flag = true;
					duplication[0] = numbers[i];
					break;
					// 否则交换两个数，继续比较
				}
				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 5, 8 };
		int[] duplication = new int[1];
		System.out.println(duplicate2(numbers, numbers.length, duplication));
	}
}
