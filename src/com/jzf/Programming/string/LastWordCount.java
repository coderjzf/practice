package com.jzf.Programming.string;

import java.util.Scanner;

public class LastWordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		System.out.println(words[words.length-1].length());
	}
}
