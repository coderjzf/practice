package com.jzf.offer.string;

/*在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置*/
public class FirstNotRepeatingChar {
	public static int firstNotRepeatingChar(String str) {
		if (str == null || str == "")
			return -1;
		int[] repeat = new int[256];
		for (int i = 0; i < str.length(); i++) {
			repeat[str.charAt(i) - '0'] += 1;
		}
		int j = 0;
		for (j = 0; j < str.length(); j++) {
			if (repeat[str.charAt(j) - '0'] == 1)
				break;
		}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingChar("abcdaddcbbbr"));
	}
}
