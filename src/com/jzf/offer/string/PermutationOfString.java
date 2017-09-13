package com.jzf.offer.string;

import java.util.ArrayList;
import java.util.Collections;

/*题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。*/
public class PermutationOfString {
	ArrayList<String> result = new ArrayList<>();

	public static ArrayList<String> permutation(String str) {
		if (str == null) {
			return null;
		}
		if (str.equals("")) {
			return null;
		}
		ArrayList<String> result = new ArrayList<>();
		permutation(str, 0, result);
		Collections.sort(result);
		return result;
	}

	public static void permutation(String str, int start, ArrayList<String> result) {
		char[] c = str.toCharArray();
		if (start == str.length() - 1) {
			result.add(str);
		} else {
			for (int i = start; i < str.length(); i++) {
				swap(c, i, start);
				permutation(str, start + 1, result);
				swap(c, start, i);
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
