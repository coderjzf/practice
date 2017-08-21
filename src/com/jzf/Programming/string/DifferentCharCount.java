package com.jzf.Programming.string;

import java.util.HashSet;
import java.util.Scanner;

/*��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
��������:
����N���ַ����ַ���ACSII�뷶Χ�ڡ�
�������:
�����Χ��(0~127)�ַ��ĸ�����
ʾ��1
����

abc
���

3*/
public class DifferentCharCount {
	public static void count(String input) {
		HashSet<Character> hashSet = new HashSet<>();
		char[] chars = input.toCharArray();
		for (char ch : chars) {
			if (ch >= 0 && ch <= 127) {
				hashSet.add(ch);
			}
		}
		System.out.println(hashSet.size());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		count(input);
		sc.close();
	}
}
