package com.jzf.offer;

import java.util.Scanner;
/*��Ŀ����
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��*/
public class NumberOf1 {
	/*��nΪ����ʱ����������ѭ��*/
	public static int numberOf1(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) > 0)
				count++;
			n = n >>> 1;
		}
		return count;
	}

	public static int numberOf(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) > 0)
				count++;
			flag = flag << 1;
		}
		return count;
	}
	
	/*
	 * ��n-1 --> ��n���ұߵ�1���0�����ұ߻���0�������1
	 * ��n-1��n���� --> ȥ��n�е����ұߵ�1
	 * */
	public static int numberOf12(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = n & (n - 1);
		}
		return count;
	}
	
	/*һ�仰�ж�һ�������Ƿ���2�ı���*/
	public static boolean nsOf2(int n){
		if((n&(n-1))==0){
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nsOf2(n));
		sc.close();
	}
}
