package com.jzf.Programming.string;

import java.util.Arrays;
import java.util.Scanner;

/*��Ŀ����
����n���ַ��������n���ַ��������ֵ������С�
��������:
�����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
�������:
�������n�У�������Ϊ�����ֵ������е��ַ�����*/
public class DictionarySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
		}
		Arrays.sort(input);
		for (String str : input) {
			System.out.println(str);
		}
		sc.close();
	}
}
