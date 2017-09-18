package com.jzf.offer;

/*题目描述
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。*/
public class Add {
	public static int add(int num1, int num2) {
		int sum = 0;
		int carray = 0;
		do {
			sum = (num1 ^ num2);//相当于两个数相加，但是不进位
			carray = (num1 & num2)<<1;//记下进位
			num1 = sum;
			num2 = carray;
		} while (num2 != 0);//即没有进位时，计算结束

		return sum;
	}
	public static void main(String[] args) {
		add(5, 17);
	}
}
