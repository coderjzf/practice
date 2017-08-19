package com.jzf.search;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ʹ��ջʵ����������
 * @author jiazhengfeng
 *
 */
public class StackTest {
	
	/**
	 * ��ȡ����(�����)���ȼ�
	 * @param s ����
	 * @return ���ȼ� ֵԽ�����ȼ�Խ��
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
	 * �������ַ�����ȡ������Ԫ��
	 * @param infix ��׺���ʽ
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
	 * �����ַ����õ���׺���ʽ����
	 * @param str �����ַ���
	 * @return ���ؽ����ַ����õ����ź����ֵ�����
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
	 * �ж�һ���ַ��ǲ�������
	 * @param c �����ַ�
	 * @return �������֣�����true;���򷵻�false
	 */
	public static boolean isNum(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

	/**
	 * �ж�һ���ַ����ǲ�������
	 * @param str �����ַ���
	 * @return �������֣�����true;���򷵻�false
	 */
	public static boolean isNum(String str) {
		Pattern num = Pattern.compile("\\d+\\.?\\d?");
		Matcher matcher = num.matcher(str);
		if (matcher.matches())
			return true;
		return false;
	}


	/**
	 * ��׺���ʽת��׺���ʽ
	 * @param str �������׺���ʽ
	 * @return ��׺���ʽ
	 */
	public static String infixToSuffix(String str) {
		Stack<String> stack = new Stack<>();// ��ʱ��������ջ
		String[] infix = getInfix(str);// ������׺���ʽ
		StringBuffer suffix = new StringBuffer();// ��׺���ʽ
		String opreation;

		int i = 0;
		while (i < infix.length) {
			String s = infix[i];
			// ��������֣�ֱ���������׺���ʽ
			if (isNum(s)) {
				suffix.append(s + " ");
				// ����������ţ����߷������ȼ�����ջ�����ţ�����ջ
			} else if ("(".equals(s) || stack.size() == 0 || getPriority(s) >= getPriority(stack.peek())) {
				stack.push(s);
				// �����������,����Ӧ�������ż�֮�еķ���ȫ����ջ������������֮��ķ����������׺���ʽ
			} else if (")".equals(s)) {
				opreation = stack.pop();
				while (!"(".equals(opreation) && stack.size() > 0) {
					suffix.append(opreation + " ");
					opreation = stack.pop();
				}
				// ����������ȼ�С��ջ������
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
	 * �������������
	 * @param a
	 * @param b
	 * @param s
	 * @return ����ֵ
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
				throw new RuntimeException("����������Ϊ0");
			}
		}
		return c;
	}
	
	/**
	 * �ɺ�׺���ʽ������
	 * @param stringBuffer ��׺���ʽ
	 * @return ���ؼ�����
	 */
	public static int suffixToResult(StringBuffer stringBuffer) {
		Stack<Integer> stack = new Stack<>();//��ʱ�������ֵ�ջ
		String[] suffix = stringBuffer.toString().split(" ");
		int  result = 0,tempResult = 0;
		String temp = null;
		int i = 0;
		int a = 0, b = 0;
		//������׺���ʽ���������֣�����ջ;�������������ջ�����������ջ���㣬�õ��Ľ������ջ��ֱ��ջ��ֻʣһ������
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
		//������������ջ
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
