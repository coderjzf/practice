package com.jzf.offer.string;

/*
 ��Ŀ����
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
�������:
�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���*/
public class FirstAppearingOnce {
	public static StringBuffer sb = new StringBuffer();

	// Insert one char from stringstream
	public static void Insert(char ch) {
		sb.append(ch);
	}

	// return the first appearence once char in current stringstream
	public static char firstAppearingOnce() {
		if (sb.equals(""))
			return '#';
		int[] repeat = new int[256];
		for (int i = 0; i < sb.length(); i++) {
			repeat[sb.charAt(i)] += 1;
		}
		int j = 0;
		for (j = 0; j < sb.length(); j++) {
			if (repeat[sb.charAt(j)] == 1)
				return sb.charAt(j);
		}
		return '#';
	}

	public static void main(String[] args) {
		Insert('!');
		Insert('@');
		Insert('$');
		Insert('*');
		System.out.println(firstAppearingOnce());
	}
}
