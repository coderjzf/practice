package com.jzf.Programming.string;

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(reverse(input));
		}
		sc.close();
	}
}
