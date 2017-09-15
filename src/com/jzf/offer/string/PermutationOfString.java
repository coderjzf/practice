package com.jzf.offer.string;

import java.util.ArrayList;
import java.util.Collections;

/*
题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
*/
public class PermutationOfString {

	public static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		if (str != null && str.length() > 0) {
			permutation(str.toCharArray(), 0, result);
			Collections.sort(result);
		}
		return result;
	}

	public static void permutation(char[] c, int start, ArrayList<String> result) {
		if (start == c.length - 1) {
			String s = new String(c);
			if (!result.contains(s)) {
				result.add(s);
			}
		} else {
			for (int i = start; i < c.length; i++) {
				swap(c, i, start);//固定第i位的字符
				permutation(c, start + 1, result);
				swap(c, i, start);//复位
			}
		}
	}

	public static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> outPut = permutation(str);
		System.out.println(outPut);
	}
}
