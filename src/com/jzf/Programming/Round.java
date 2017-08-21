package com.jzf.Programming;

import java.util.Scanner;

public class Round {
	public static void round(double input) {
		String str = input + "";
		String leftOfPoint = str.substring(0, str.indexOf("."));
		String rightOfPoint = str.substring(str.indexOf(".") + 1);
		if (Integer.valueOf(rightOfPoint) >= 5) {
			System.out.println(Integer.valueOf(leftOfPoint) + 1);
		} else {
			System.out.println(Integer.valueOf(leftOfPoint));
		}
	}

	public static void round2(double input) {
		int left = (int) input;
		double right = input - left;
		System.out.println(right >= 0.5 ? left + 1 : left);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		round2(input);
		sc.close();
	}
}
