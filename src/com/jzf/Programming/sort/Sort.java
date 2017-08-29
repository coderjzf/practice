package com.jzf.Programming.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
	public static void sort(String input) {
		char[] chars = input.toCharArray();
		ArrayList<Integer> integerList = new ArrayList<>();
		ArrayList<Character> characterList = new ArrayList<>();

		for (char ch : chars) {
			if (ch >= '0' && ch <= '9') {
				char[] c = new char[] { ch };
				String s = new String(c);
				integerList.add(Integer.valueOf(s));
			} else {
				characterList.add(ch);
			}
		}
		Collections.sort(characterList);
		Collections.sort(integerList);
		for (Character ch : characterList) {
			System.out.print(ch);
		}
		for (Integer i : integerList) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sort(input);
		sc.close();
	}
}
