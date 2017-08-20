package com.jzf.Programming.string;

import java.util.Scanner;
/*连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
首先输入一个整数，为要输入的字符串个数。
例如：
输入：2
      abc
      12345789
输出：abc00000
      12345678
      90000000*/
public class SplitString {
	public static void split(String input) {
		if (input == null) {
			return;
		}
		int cover = 0;
		StringBuffer stringBuffer = new StringBuffer(input);
		if (stringBuffer.length() % 8 == 0) {
			print(stringBuffer);
		} else {
			cover = 8 - stringBuffer.length() % 8;
			while (--cover >= 0) {
				stringBuffer.append("0");
			}
			print(stringBuffer);
		}
	}

	public static void print(StringBuffer stringBuffer) {
		while (stringBuffer.length() > 0) {
			System.out.println(stringBuffer.substring(0, 8));
			stringBuffer.delete(0, 8);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			String input = sc.next();
			split(input);
		}
		sc.close();
	}
}
