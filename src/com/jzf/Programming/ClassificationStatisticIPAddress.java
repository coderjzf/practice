package com.jzf.Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*��Ŀ����
�����IP��ַ�Ͷ�Ӧ�����룬���з���ʶ��Ҫ����A/B/C/D/E���ַ���࣬���Ϸ��ĵ�ַ�����뵥�����ࡣ

���е�IP��ַ����Ϊ A,B,C,D,E����

A���ַ1.0.0.0~126.255.255.255;

B���ַ128.0.0.0~191.255.255.255;

C���ַ192.0.0.0~223.255.255.255;

D���ַ224.0.0.0~239.255.255.255��

E���ַ240.0.0.0~255.255.255.255

˽��IP��Χ�ǣ�
10.0.0.0��10.255.255.255
172.16.0.0��172.31.255.255
192.168.0.0��192.168.255.255

��������Ϊǰ����������1��Ȼ��ȫ��0�������磺255.255.255.32����һ���Ƿ������룩
������ʱĬ����0��ͷ��IP��ַ�ǺϷ��ģ�����0.1.1.2���ǺϷ���ַ

��������:
�����ַ�����ÿ��һ��IP��ַ�����룬��~������
�������:
ͳ��A��B��C��D��E������IP��ַ��������롢˽��IP�ĸ�����֮���Կո������
ʾ��1
����

10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
���

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