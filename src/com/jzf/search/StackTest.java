package com.jzf.search;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 使用栈实现四则运算
 * @author jiazhengfeng
 *
 */
public class StackTest {
	
	/**
	 * 获取符号(运算符)优先级
	 * @param s 符号
	 * @return 优先级 值越大，优先级越高
	 */
	public static int getPriority(String s) {
		if (s.equals(")") || s.equals("(")) {
			return 0;
		} else if (s.equals("+") || s.equals("-")) {
			return 1;
		}
		return 2;
	}

	/**
	 * 从输入字符串中取出数据元素
	 * @param infix 中缀表达式
	 * @return
	 */
	public static String nextElement(StringBuffer infix) {
		StringBuffer result = new StringBuffer();
		char c = infix.charAt(0);
		infix.deleteCharAt(0);
		result.append(c);

		if (isNum(c)) {
			while (infix.length() > 0) {
				c = infix.charAt(0);
				if (!isNum(c))
					break;
				infix.deleteCharAt(0);
				result.append(c);
			}
		}
		return result.toString();
	}

	/**
	 * 解析字符串得到中缀表达式数组
	 * @param str 输入字符串
	 * @return 返回解析字符串得到符号和数字的数组
	 */
	public static String[] getInfix(String str) {
		StringBuffer stringBuffer = new StringBuffer(str);
		String[] temp = new String[50];
		int i = 0, j = 0;
		while (stringBuffer.length() > 0) {
			temp[i] = nextElement(stringBuffer);
			i++;
		}
		while (temp[j] != null) {
			j++;
		}
		String[] infix = new String[j];
		infix = Arrays.copyOf(temp, j);
		return infix;
	}

	/**
	 * 判断一个字符是不是数字
	 * @param c 输入字符
	 * @return 若是数字，返回true;否则返回false
	 */
	public static boolean isNum(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

	/**
	 * 判断一个字符串是不是数字
	 * @param str 输入字符串
	 * @return 若是数字，返回true;否则返回false
	 */
	public static boolean isNum(String str) {
		Pattern num = Pattern.compile("\\d+\\.?\\d?");
		Matcher matcher = num.matcher(str);
		if (matcher.matches())
			return true;
		return false;
	}


	/**
	 * 中缀表达式转后缀表达式
	 * @param str 输入的中缀表达式
	 * @return 后缀表达式
	 */
	public static String infixToSuffix(String str) {
		Stack<String> stack = new Stack<>();// 临时存放运算的栈
		String[] infix = getInfix(str);// 解析中缀表达式
		StringBuffer suffix = new StringBuffer();// 后缀表达式
		String opreation;

		int i = 0;
		while (i < infix.length) {
			String s = infix[i];
			// 如果是数字，直接输出到后缀表达式
			if (isNum(s)) {
				suffix.append(s + " ");
				// 如果是左括号，或者符号优先级大于栈顶符号，则入栈
			} else if ("(".equals(s) || stack.size() == 0 || getPriority(s) >= getPriority(stack.peek())) {
				stack.push(s);
				// 如果是右括号,将对应的左括号及之中的符号全部出栈，并将除括号之外的符号输出到后缀表达式
			} else if (")".equals(s)) {
				opreation = stack.pop();
				while (!"(".equals(opreation) && stack.size() > 0) {
					suffix.append(opreation + " ");
					opreation = stack.pop();
				}
				// 如果符号优先级小于栈顶符号
			} else {
				while (stack.size() > 0) {
					opreation = stack.pop();
					suffix.append(opreation + " ");
				}
				stack.push(s);
			}
			i++;
		}
		while (stack.size() > 0) {
			suffix.append(stack.pop() + " ");
		}
		return suffix.toString();
	}

	/**
	 * 根据运算符计算
	 * @param a
	 * @param b
	 * @param s
	 * @return 计算值
	 */
	public static int calculate(int a, int b, String s) {
		int c = 0;
		if ("+".equals(s)) {
			c = a + b;
		} else if ("-".equals(s)) {
			c = a - b;
		} else if ("*".equals(s)) {
			c = a * b;
		} else {
			try {
				c = a / b;
			} catch (Exception e) {
				throw new RuntimeException("被除数不能为0");
			}
		}
		return c;
	}
	
	/**
	 * 由后缀表达式计算结果
	 * @param stringBuffer 后缀表达式
	 * @return 返回计算结果
	 */
	public static int suffixToResult(StringBuffer stringBuffer) {
		Stack<Integer> stack = new Stack<>();//临时保存数字的栈
		String[] suffix = stringBuffer.toString().split(" ");
		int  result = 0,tempResult = 0;
		String temp = null;
		int i = 0;
		int a = 0, b = 0;
		//遍历后缀表达式，若是数字，则入栈;若是运算符，则将栈顶两个数组出栈计算，得到的结果再入栈，直到栈中只剩一个数字
		while (i < suffix.length) {
			temp = suffix[i];
			if (isNum(temp)) {
				stack.push(Integer.valueOf(temp));
			} else {
				b = stack.pop();
				a = stack.pop();
				tempResult = calculate(a, b, temp);
				stack.push(tempResult);
			}
			i++;
		}
		//最终运算结果出栈
		result = stack.pop();
		return result;
	}

	public static void main(String[] args) {
		// split("33 + 67 / 55");
		String suffix = infixToSuffix("9+(3-1)*3+10/2");
		System.out.println(suffix);
		int result = suffixToResult(new StringBuffer(suffix));
		System.out.println(result);
	}
}
