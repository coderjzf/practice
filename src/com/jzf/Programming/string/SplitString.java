package com.jzf.Programming.string;

import java.util.Scanner;

public class SplitString {
	public static void split(String input) {
		if (input == null) {
			return;
		}
		int cover = 0;
		StringBuffer stringBuffer = new StringBuffer(input);
		if (stringBuffer.length() % 8 == 0) {
			print(stringBuffer);
		} else {
			cover = 8 - stringBuffer.length() % 8;
			while (--cover >= 0) {
				stringBuffer.append("0");
			}
			print(stringBuffer);
		}
	}

	public static void print(StringBuffer stringBuffer) {
		while (stringBuffer.length() > 0) {
			System.out.println(stringBuffer.substring(0, 8));
			stringBuffer.delete(0, 8);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			String input = sc.next();
			split(input);
		}
		sc.close();
	}
}
