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
	
	/*
	 * 将n-1 --> 把n最右边的1变成0，若右边还有0，都变成1
	 * 将n-1与n相与 --> 去除n中的最右边的1
	 * */
	public static int numberOf12(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = n & (n - 1);
		}
		return count;
	}
	
	/*一句话判断一个整数是否是2的倍数*/
	public static boolean nsOf2(int n){
		if((n&(n-1))==0){
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nsOf2(n));
		sc.close();
	}
}
