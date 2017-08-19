package com.jzf.Programming.sort;

import java.util.Scanner;

/**
 * 记负均正2
 * 
 * @author jiazhengfeng
 */
public class CountNegativeAndAvgPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int total = 0;
		double avg = 0;

		while (sc.hasNext()) {
			int input = sc.nextInt();
			if (input < 0) {
				count++;
			} else {
				total++;
				sum += input;
			}
		}
		avg = sum / total;
		System.out.println(count);
		System.out.println(String.format("%.1f", avg));

		sc.close();
	}
}
