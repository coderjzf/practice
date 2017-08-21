package com.jzf.Programming;

import java.util.ArrayList;
import java.util.Scanner;

/*����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
���һ��������ҲҪ�пո�

��ϸ������

�����ӿ�˵����
public String getResult(long ulDataInput)
���������
long ulDataInput�������������
����ֵ��
String*/
/*
 * 
 * 1.��һ����n����������ֱ�������������
 * 2.��i=2��ʼ,n%2==0�����;������n%��һ������...
 * 48
 */
public class PrimeFactor {
	public static void getPrimeFactor(long input) {
		ArrayList<Long> list = new ArrayList<>();
		long temp = input;
		
		if(isPrime(input)){
			System.out.println(input+" ");
			return;
		}
		
		for (long i = 2; i <= input / 2; i++) {
			if (!isPrime(i)) {
				continue;
			}
			while (temp % i == 0) {
				list.add(i);
				temp = temp / i;
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPrime(long number) {
		if (number == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long input = sc.nextLong();
			getPrimeFactor(input);
		}
		sc.close();
	}
}
