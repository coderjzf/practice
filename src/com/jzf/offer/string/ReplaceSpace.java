package com.jzf.offer.string;

import java.util.Scanner;
/*��Ŀ����
��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
public class ReplaceSpace {
	/*�Ӻ���ǰ���� �����ո����滻 ���Ӷ�Ϊo(n)*/
	public static String replaceSpace(StringBuffer str) {
		while(str.lastIndexOf(" ")!=-1){
			int flag = str.lastIndexOf(" ");
			str.replace(flag, flag+1, "%20");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.nextLine());
		System.out.println(replaceSpace(str));
		sc.close();
	}
}
