package com.jzf.offer.stack;

import java.util.Stack;

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
