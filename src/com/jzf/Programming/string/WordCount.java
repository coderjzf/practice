package com.jzf.Programming.string;

import java.util.Scanner;

/*д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
��������:
����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
�������:
��������ַ����к��и��ַ��ĸ�����*/
public class WordCount {
	public static int wordcount() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String word = sc.nextLine();
		sc.close();
		
		int count = 0;
		line = line.toLowerCase();
		word = word.toLowerCase();
		while (line.length() >= word.length()) {
			while (line.contains(word)) {
					count++;
					line = line.substring(line.indexOf(word) + word.length());
			}
			break;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(wordcount());
	}
}
