package com.jzf.Programming.string;

/*�ַ�����ת*/
import java.util.Scanner;

public class ReverseString {
	public static String reverse(String input) {
		StringBuffer reverse = new StringBuffer();
		StringBuffer buffer = new StringBuffer(input);
		while (buffer.length() > 0) {
			reverse.append(buffer.substring(buffer.length() - 1));
			buffer.deleteCharAt(buffer.length() - 1);
		}
		return reverse.toString();
	}

	public static String reverse2(String input) {
		char[] chars = input.toCharArray();
		StringBuffer outPut = new StringBuffer();
		for (int i = chars.length - 1; i >= 0; i--) {
			outPut.append(chars[i]);
		}
		return outPut.toString();
	}

	/*
	 * ��Ŀ���� ��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
	 * ���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�
	 * 
	 * ��������: ��һ��Ӣ������Ե���Ϊ��λ�����ŷš� �������: �õ�����ľ��� ʾ��1 ���� I am a boy ��� boy a am I
	 */
	public static String reverseSentence(String sentence) {
		String[] words = sentence.split(" ");
		StringBuffer outPut = new StringBuffer();
		for (int i = words.length - 1; i >= 0; i--) {
			outPut.append(words[i]+" ");
		}
		outPut.deleteCharAt(outPut.length()-1);
		return outPut.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			System.out.println(reverseSentence(input));
		}
		sc.close();
	}
}
