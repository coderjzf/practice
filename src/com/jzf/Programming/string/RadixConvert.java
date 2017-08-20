package com.jzf.Programming.string;

import java.util.Scanner;

/*输入16进制字符串 输出十进制字符串*/
public class RadixConvert {

	public static void convert(String input) {
		StringBuffer stringBuffer = new StringBuffer(input);
		int i = 0;
		int sum = 0;
		double m;
		stringBuffer.delete(0, 2);
		while (stringBuffer.length() > 0) {
			char c = stringBuffer.charAt(stringBuffer.length() - 1);
			if (c <= '9') {
				m= c * (Math.pow(16, i));
				sum+=m;
			} else {
				m= (c - 55) * (Math.pow(16, i));
				sum+=m;
			}
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(Integer.decode(input));
		}
		sc.close();
	}
}
