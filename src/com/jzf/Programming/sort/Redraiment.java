package com.jzf.Programming.sort;

import java.util.Arrays;
import java.util.Scanner;

/*��Ŀ���� 
   Redraiment����÷��׮�ĸ��֡�Redraiment������㲻�ޣ���ǰ�������ߵ�׮���ߣ����ߵĲ�����࣬��֪��Ϊʲô��������Redraiment�о�������ߵĲ����� 
 
��������
6
2 5 1 5 4 5
 
�������
3
 
��ʾ
Example: 
6����ĸ߶ȸ�Ϊ 2 5 1 5 4 5 
��ӵ�1��ʼ��,���Ϊ3��, 2 4 5 
�ӵ�2��ʼ��,���ֻ��1��,5 
���ӵ�3��ʼ�������3��,1 4 5 
�ӵ�5��ʼ�������2��,4 5
������������3��

 
��������:
������У�����������ĸ�������������Ӧ����������
�������:
������
ʾ��1
����

6
2
5
1
5
4
5
���

3*/
/*�����������   ʹ�ö�̬�滮*/
public class Redraiment {
	public static void getMaxSteps(int[] input) {
		int[] a = Arrays.copyOf(input, input.length);
		int[] b = new int[a.length];
		Arrays.sort(input);
		int n = input.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (input[i] == a[j]) {
					b[i] = j;
					a[j] = -1;
					break;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			int steps = 0;
			for (int j = i; j < n - 1; j++) {
				if (a[i] < a[j + 1]) {
					steps++;
				}

			}
			if (steps > max)
				max = steps;
		}
		System.out.println(max);
	}

	public static void getMaxSteps2(int[] input) {
		int n = input.length;
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (input[j] < input[i])
					dp[i] = dp[j] + 1 - dp[i] > 0 ? dp[j] + 1 : dp[i];
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (dp[i] > max)
				max = dp[i];
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] input = new int[n];
			int i = 0;
			while (n-- != 0) {
				input[i] = sc.nextInt();
				i++;
			}
			getMaxSteps2(input);
		}
		sc.close();
	}
}
