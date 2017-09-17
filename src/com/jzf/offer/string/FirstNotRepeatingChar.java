package com.jzf.offer.string;

/*��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��*/
public class FirstNotRepeatingChar {
	public static int firstNotRepeatingChar(String str) {
		if (str == null || str == "")
			return -1;
		int[] repeat = new int[256];
		for (int i = 0; i < str.length(); i++) {
			repeat[str.charAt(i) - '0'] += 1;
		}
		int j = 0;
		for (j = 0; j < str.length(); j++) {
			if (repeat[str.charAt(j) - '0'] == 1)
				break;
		}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingChar("abcdaddcbbbr"));
	}
}
