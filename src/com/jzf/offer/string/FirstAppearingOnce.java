package com.jzf.offer.string;

/*
 题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。*/
public class FirstAppearingOnce {
	public static StringBuffer sb = new StringBuffer();

	// Insert one char from stringstream
	public static void Insert(char ch) {
		sb.append(ch);
	}

	// return the first appearence once char in current stringstream
	public static char firstAppearingOnce() {
		if (sb.equals(""))
			return '#';
		int[] repeat = new int[256];
		for (int i = 0; i < sb.length(); i++) {
			repeat[sb.charAt(i)] += 1;
		}
		int j = 0;
		for (j = 0; j < sb.length(); j++) {
			if (repeat[sb.charAt(j)] == 1)
				return sb.charAt(j);
		}
		return '#';
	}

	public static void main(String[] args) {
		Insert('!');
		Insert('@');
		Insert('$');
		Insert('*');
		System.out.println(firstAppearingOnce());
	}
}
