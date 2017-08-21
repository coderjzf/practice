package com.jzf.Programming.string;

import java.util.HashSet;
import java.util.Scanner;

/*编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
输入描述:
输入N个字符，字符在ACSII码范围内。
输出描述:
输出范围在(0~127)字符的个数。
示例1
输入

abc
输出

3*/
public class DifferentCharCount {
	public static void count(String input) {
		HashSet<Character> hashSet = new HashSet<>();
		char[] chars = input.toCharArray();
		for (char ch : chars) {
			if (ch >= 0 && ch <= 127) {
				hashSet.add(ch);
			}
		}
		System.out.println(hashSet.size());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		count(input);
		sc.close();
	}
}
