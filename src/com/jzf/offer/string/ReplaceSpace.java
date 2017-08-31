package com.jzf.offer.string;

import java.util.Scanner;
/*题目描述
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
public class ReplaceSpace {
	/*从后往前遍历 遇到空格则替换 复杂度为o(n)*/
	public static String replaceSpace(StringBuffer str) {
		while(str.lastIndexOf(" ")!=-1){
			int flag = str.lastIndexOf(" ");
			str.replace(flag, flag+1, "%20");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.nextLine());
		System.out.println(replaceSpace(str));
		sc.close();
	}
}
