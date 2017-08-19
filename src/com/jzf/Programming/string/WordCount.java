package com.jzf.Programming.string;

import java.util.Scanner;

/*写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。
输出描述:
输出输入字符串中含有该字符的个数。*/
public class WordCount {
	public static int wordcount() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String word = sc.nextLine();
		sc.close();
		
		int count = 0;
		line = line.toLowerCase();
		word = word.toLowerCase();
		while (line.length() >= word.length()) {
			while (line.contains(word)) {
					count++;
					line = line.substring(line.indexOf(word) + word.length());
			}
			break;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(wordcount());
	}
}
