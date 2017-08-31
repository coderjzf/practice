package com.jzf.offer.stack;

import java.util.Stack;

public class IsPopOrder {
	public static boolean isPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();

		boolean possible = false;
		int nextPush = 0;
		int nextPop = 0;
		while (nextPop < popA.length) {
			// 如果栈为空或者栈顶数字不是要弹出的数字
			while (stack.empty() || stack.peek() != popA[nextPop]) {
				// 如果压栈序列已经到头，仍然没有搜索到要弹出的数字，则跳出循环
				if (nextPush == pushA.length) {
					break;
				}
				stack.push(pushA[nextPush]);
				nextPush++;
			}
			// 如果栈顶数字不是要弹出的数字(此时压栈序列已经到头)，则跳出循环
			if (popA[nextPop] != stack.peek()) {
				break;
			}
			// 如果栈顶数字是要弹出的数字，则直接弹出栈顶数字
			stack.pop();
			// 指向下一个栈顶数字
			nextPop++;
			// 如果栈为空，且出栈序列已经遍历完毕，则说明该序列是给定的压栈序列的出栈序列
			if (stack.empty() && nextPop == popA.length) {
				possible = true;
			}
		}
		return possible;
	}

	public static boolean isPopOrder2(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		for (int i = 0, j = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while (!stack.empty() && stack.peek() == popA[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 3, 5, 2,1};
		boolean r = isPopOrder2(pushA, popA);
		System.out.println(r);
	}
}
