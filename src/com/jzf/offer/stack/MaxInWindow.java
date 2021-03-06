package com.jzf.offer.stack;

import java.util.ArrayList;

/*
 题目描述
给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
他们的最大值分别为{4,4,6,6,6,5}； 
针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
*/
public class MaxInWindow {
	public static ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
/*		if (num == null || num.length == 0 || size < num.length)
			return result;*/
		int end = size - 1;
		for (int i = end; i < num.length; i++) {
			int max = num[i];
			for (int j = i - 2; j <= i; j++) {
				if (num[j] > max)
					max = num[j];
			}
			result.add(max);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		ArrayList<Integer> result = maxInWindows(num, 3);
		for (Integer i : result)
			System.out.println(i);
	}
}
