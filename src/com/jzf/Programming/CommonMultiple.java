package com.jzf.Programming;

import java.util.Scanner;

/**
 * ����С������
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
		
		//շת����������Լ��
		while (remainder != 0) {
			remainder = divisor % dividend;
			divisor = dividend;
			dividend = remainder;
		}
		
		System.out.println(a * b / divisor);
	}
}
