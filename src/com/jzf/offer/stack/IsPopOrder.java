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
			// ���ջΪ�ջ���ջ�����ֲ���Ҫ����������
			while (stack.empty() || stack.peek() != popA[nextPop]) {
				// ���ѹջ�����Ѿ���ͷ����Ȼû��������Ҫ���������֣�������ѭ��
				if (nextPush == pushA.length) {
					break;
				}
				stack.push(pushA[nextPush]);
				nextPush++;
			}
			// ���ջ�����ֲ���Ҫ����������(��ʱѹջ�����Ѿ���ͷ)��������ѭ��
			if (popA[nextPop] != stack.peek()) {
				break;
			}
			// ���ջ��������Ҫ���������֣���ֱ�ӵ���ջ������
			stack.pop();
			// ָ����һ��ջ������
			nextPop++;
			// ���ջΪ�գ��ҳ�ջ�����Ѿ�������ϣ���˵���������Ǹ�����ѹջ���еĳ�ջ����
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
