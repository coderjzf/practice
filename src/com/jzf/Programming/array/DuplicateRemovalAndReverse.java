package com.jzf.Programming.array;

import java.util.ArrayList;
import java.util.Scanner;

/*题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
输入描述:
输入一个int型整数
输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数*/
public class DuplicateRemovalAndReverse {
	public static void duplicateRemovalAndReverse(int input){
		StringBuffer stringBuffer = new StringBuffer(input+"");
		ArrayList<Integer> list = new ArrayList<>();
		while(stringBuffer.length()>0){
			int i = Integer.valueOf(stringBuffer.substring(stringBuffer.length()-1));
			if(!list.contains(i)){
				list.add(i);
			}
			stringBuffer.deleteCharAt(stringBuffer.length()-1);
		}
		for(Integer i:list){
			stringBuffer.append(i+"");
		}
		System.out.println(Integer.valueOf(stringBuffer.toString()));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		duplicateRemovalAndReverse(input);
		sc.close();
	}
}
