package com.jzf.offer.string;

/*��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��*/
public class FirstNotRepeatingChar {
	/* ʱ�临�Ӷ�o(n) �ռ临�Ӷ�o(1) */
	public static int firstNotRepeatingChar(String str) {
		if (str == null || str == "")
			return -1;
		int[] repeat = new int[256];
		for (int i = 0; i < str.length(); i++) {
			repeat[str.charAt(i)] += 1;
		}
		int j = 0;
		for (j = 0; j < str.length(); j++) {
			if (repeat[str.charAt(j)] == 1)
				break;
			if (j == str.length() - 1 && repeat[str.charAt(j)] != 1)
				return -1;
		}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingChar("abcdefabcdefeegg"));
	}
}
