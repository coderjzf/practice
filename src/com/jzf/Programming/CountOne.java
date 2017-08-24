package com.jzf.Programming;

import java.util.Scanner;

/*输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
输入描述:
 输入一个整数（int类型）
输出描述:
 这个数转换成2进制后，输出1的个数
示例1
输入

5
输出

2*/
public class CountOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String str = Integer.toBinaryString(input);
		int count = 0;
		for(int i = str.length()-1;i>=0;i--){
			if(str.charAt(i) == '1'){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}






