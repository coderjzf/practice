package com.jzf.Programming;

import java.util.Scanner;

/*����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����
��������:
 ����һ��������int���ͣ�
�������:
 �����ת����2���ƺ����1�ĸ���
ʾ��1
����

5
���

2*/
public class CountOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String str = Integer.toBinaryString(input);
		int count = 0;
		for(int i = str.length()-1;i>=0;i--){
			if(str.charAt(i) == '1'){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}






