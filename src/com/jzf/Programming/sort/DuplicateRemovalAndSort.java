package com.jzf.Programming.sort;

import java.util.Scanner;
import java.util.TreeSet;

/*��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
 * �����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 
Input Param 
     n               ����������ĸ���     
 inputArray      n�����������ɵ����� 
     
Return Value
     OutputArray    ����������������
 
ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣
��������:
������У���������������ĸ�������������Ӧ����������
�������:
���ض��У������Ľ��*/
public class DuplicateRemovalAndSort {
	public static void sort() {
		Scanner sc = new Scanner(System.in);
		int total;
		TreeSet<Integer> treeSet = new TreeSet<>();
		sc.close();
		
		while(sc.hasNext()){
			total = sc.nextInt();
			while(total>0){
				treeSet.add(sc.nextInt());
				total--;
			}
			
			for (Object o : treeSet) {
				System.out.println(o);
			}
		}
	}

	public static void main(String[] args) {
		sort();
	}
}
