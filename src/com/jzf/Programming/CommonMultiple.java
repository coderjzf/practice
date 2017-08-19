package com.jzf.Programming;

import java.util.Scanner;

/**
 * 求最小公倍数
 * 
 * @author jiazhengfeng
 */
public class CommonMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int divisor = a;
		int dividend = b;
		int remainder = 1;
		
		//辗转相除法求最大公约数
		while (remainder != 0) {
			remainder = divisor % dividend;
			divisor = dividend;
			dividend = remainder;
		}
		
		System.out.println(a * b / divisor);
	}
}
