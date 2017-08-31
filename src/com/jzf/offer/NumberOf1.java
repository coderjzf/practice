package com.jzf.offer;

import java.util.Scanner;
/*题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/
public class NumberOf1 {
	/*当n为负数时，会陷入死循环*/
	public static int numberOf1(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) > 0)
				count++;
			n = n >>> 1;
		}
		return count;
	}

	public static int numberOf(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) > 0)
				count++;
			flag = flag << 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(numberOf1(n));
		sc.close();
	}
}
