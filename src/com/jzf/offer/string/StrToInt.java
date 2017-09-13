package com.jzf.offer.string;

/*��Ŀ����
��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
��������:
����һ���ַ���,����������ĸ����,����Ϊ��
�������:
����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
ʾ��1
����

+2147483647
    1a33
���

2147483647
    0*/
public class StrToInt {
	public static int strToInt(String str) {
		boolean isIlligal = false;
		boolean negative = false;
		if (str == null || str.equals("") || str.equals("+") || str.equals("-")) {
			isIlligal = true;
			return 0;
		}

		int sum = 0;
		int start = 0;
		char[] chars = str.toCharArray();

		if (chars[0] == '-') {
			negative = true;
			start = 1;
		} else if (chars[0] == '+') {
			start = 1;
		}

		for (int i = start; i < chars.length; i++) {
			if (chars[i] > '9' || chars[i] < '0') {
				isIlligal = true;
				return 0;
			}
			sum = sum * 10 + chars[i] - '0';
		}

		return negative == false ? -sum : sum;
	}
	
	public static void main(String[] args) {
		System.out.println(strToInt("2147483649"));
	}
}
