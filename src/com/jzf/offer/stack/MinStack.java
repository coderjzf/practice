package com.jzf.offer.stack;

import java.util.Stack;

/*题目描述
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

两个栈，一个主栈存放所有元素，一个辅助栈，栈顶存放主栈当前所有元素中的最小值
*/
public class MinStack {
	Stack<Integer> mainStack = new Stack<>();
	Stack<Integer> assistantStack = new Stack<>();

	public void push(int node) {
		if (mainStack.empty()) {
			mainStack.push(node);
			assistantStack.push(node);
		} else {
			if (node <= assistantStack.peek()) {
				assistantStack.push(node);
			}
			mainStack.push(node);
		}
	}

	public void pop() {
		if (!mainStack.empty()) {
			if (mainStack.peek() == assistantStack.peek()) {
				assistantStack.pop();
			}
			mainStack.pop();
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int top() {
		return mainStack.peek();
	}

	public int min() {
		return assistantStack.peek();
	}
}
