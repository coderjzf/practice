package com.jzf.Programming.sort;

import java.util.Arrays;
import java.util.Scanner;

/*题目描述 
   Redraiment是走梅花桩的高手。Redraiment总是起点不限，从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？ 
 
样例输入
6
2 5 1 5 4 5
 
样例输出
3
 
提示
Example: 
6个点的高度各为 2 5 1 5 4 5 
如从第1格开始走,最多为3步, 2 4 5 
从第2格开始走,最多只有1步,5 
而从第3格开始走最多有3步,1 4 5 
从第5格开始走最多有2步,4 5
所以这个结果是3。

 
输入描述:
输入多行，先输入数组的个数，再输入相应个数的整数
输出描述:
输出结果
示例1
输入

6
2
5
1
5
4
5
输出

3*/
/*求最长递增序列   使用动态规划*/
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
