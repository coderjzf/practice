package com.jzf.Programming;

import java.util.Scanner;

public class CubeRoot {
	public static double cubeRoot(double input) {
		double min = 0;
		double mid = 0;
		double max = input;

		while (max - min > 0.001) {
			mid = (min + max) / 2;
			if (mid * mid * mid < input) {
				min = mid;
			} else if (mid * mid * mid > input) {
				max = mid;
			} else {
				return mid;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double input = sc.nextDouble();
			System.out.println(String.format("%.1f", cubeRoot(input)));
		}
		sc.close();
	}
}
