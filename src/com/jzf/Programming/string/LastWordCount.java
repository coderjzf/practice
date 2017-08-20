package com.jzf.Programming.string;

import java.util.Scanner;

/**
 * 求输入一行字符串，最后一个字符串的长度
 * @author jiazhengfeng
 *
 */
public class LastWordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		System.out.println(words[words.length-1].length());
	}
}
