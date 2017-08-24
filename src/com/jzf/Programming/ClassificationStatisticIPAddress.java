package com.jzf.Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*题目描述
请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。

所有的IP地址划分为 A,B,C,D,E五类

A类地址1.0.0.0~126.255.255.255;

B类地址128.0.0.0~191.255.255.255;

C类地址192.0.0.0~223.255.255.255;

D类地址224.0.0.0~239.255.255.255；

E类地址240.0.0.0~255.255.255.255

私网IP范围是：
10.0.0.0～10.255.255.255
172.16.0.0～172.31.255.255
192.168.0.0～192.168.255.255

子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址

输入描述:
多行字符串。每行一个IP地址和掩码，用~隔开。
输出描述:
统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。
示例1
输入

10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
输出

1 0 1 0 0 2 1*/
/*public class ClassificationStatisticIPAddress {
	public static void staticstic(ArrayList<String> input) {
		for (String str : input) {
			String ip = str.substring(0, str.indexOf("~"));
			String mask = str.substring(str.indexOf("~") + 1);
			int[] ints = toInt(mask);
			//List<Integer> list2 = toList(ip);
		}
	}

	public static int[] toInt(String str) {
		String[] strs = str.split(".");
		int[] ints = new int[strs.length];
		for (int i = 0; i < strs.length - 1; i--) {
			ints[i] = Integer.valueOf(strs[i]);
		}
		return ints;
	}

	public static boolean maskInvalid(int[] ints) {
		if(ints[0]!=255){
			if(ints[0]!=254 || 252 || 248 || )
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();
		while (sc.hasNext()) {
			input.add(sc.next());
		}
		staticstic(input);
	}
}
*/