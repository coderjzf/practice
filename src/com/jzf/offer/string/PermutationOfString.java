package com.jzf.offer.string;

import java.util.ArrayList;
import java.util.Collections;

/*
��Ŀ����
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
*/
public class PermutationOfString {

	public static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		if (str != null && str.length() > 0) {
			permutation(str.toCharArray(), 0, result);
			Collections.sort(result);
		}
		return result;
	}

	public static void permutation(char[] c, int start, ArrayList<String> result) {
		if (start == c.length - 1) {
			String s = new String(c);
			if (!result.contains(s)) {
				result.add(s);
			}
		} else {
			for (int i = start; i < c.length; i++) {
				swap(c, i, start);//�̶���iλ���ַ�
				permutation(c, start + 1, result);
				swap(c, i, start);//��λ
			}
		}
	}

	public static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> outPut = permutation(str);
		System.out.println(outPut);
	}
}
