package com.jzf.Programming.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*题目描述
给定n个字符串，请对n个字符串按照字典序排列。
输入描述:
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述:
数据输出n行，输出结果为按照字典序排列的字符串。*/
public class DictionarySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
		}
		Arrays.sort(input);
		for (String str : input) {
			System.out.println(str);
		}
		sc.close();
	}
}
