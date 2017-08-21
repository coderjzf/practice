package com.jzf.Programming.string;

/*字符串反转*/
import java.util.Scanner;

public class ReverseString {
	public static String reverse(String input) {
		StringBuffer reverse = new StringBuffer();
		StringBuffer buffer = new StringBuffer(input);
		while (buffer.length() > 0) {
			reverse.append(buffer.substring(buffer.length() - 1));
			buffer.deleteCharAt(buffer.length() - 1);
		}
		return reverse.toString();
	}

	public static String reverse2(String input) {
		char[] chars = input.toCharArray();
		StringBuffer outPut = new StringBuffer();
		for (int i = chars.length - 1; i >= 0; i--) {
			outPut.append(chars[i]);
		}
		return outPut.toString();
	}

	/*
	 * 题目描述 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
	 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
	 * 
	 * 输入描述: 将一个英文语句以单词为单位逆序排放。 输出描述: 得到逆序的句子 示例1 输入 I am a boy 输出 boy a am I
	 */
	public static String reverseSentence(String sentence) {
		String[] words = sentence.split(" ");
		StringBuffer outPut = new StringBuffer();
		for (int i = words.length - 1; i >= 0; i--) {
			outPut.append(words[i]+" ");
		}
		outPut.deleteCharAt(outPut.length()-1);
		return outPut.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			System.out.println(reverseSentence(input));
		}
		sc.close();
	}
}
