package com.jzf.offer.string;

import java.util.ArrayList;
import java.util.Collections;

/*��Ŀ����
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��*/
public class PermutationOfString {
	ArrayList<String> result = new ArrayList<>();

	public static ArrayList<String> permutation(String str) {
		if (str == null) {
			return null;
		}
		if (str.equals("")) {
			return null;
		}
		ArrayList<String> result = new ArrayList<>();
		permutation(str, 0, result);
		Collections.sort(result);
		return result;
	}

	public static void permutation(String str, int start, ArrayList<String> result) {
		char[] c = str.toCharArray();
		if (start == str.length() - 1) {
			result.add(str);
		} else {
			for (int i = start; i < str.length(); i++) {
				swap(c, i, start);
				permutation(str, start + 1, result);
				swap(c, start, i);
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
