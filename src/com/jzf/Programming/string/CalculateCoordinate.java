package com.jzf.Programming.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*��Ŀ����
����һ��������㹤�ߣ� A��ʾ�����ƶ���D��ʾ�����ƶ���W��ʾ�����ƶ���S��ʾ�����ƶ����ӣ�0,0���㿪ʼ�ƶ����������ַ��������ȡһЩ���꣬�����������������������ļ����档
 
���룺
 
�Ϸ�����ΪA(����D����W����S) + ���֣���λ���ڣ�
 
����֮����;�ָ���
 
�Ƿ��������Ҫ���ж�������AA10;  A1A;  $%$;  YAD; �ȡ�
 
������һ���򵥵����� �磺
 
A10;S20;W10;D30;X;A1A;B10A11;;A10;
 
������̣�
 
��㣨0,0��
 
+   A10   =  ��-10,0��
 
+   S20   =  (-10,-20)
 
+   W10  =  (-10,-10)
 
+   D30  =  (20,-10)
 
+   x    =  ��Ч
 
+   A1A   =  ��Ч
 
+   B10A11   =  ��Ч
 
+  һ���� ��Ӱ��
 
+   A10  =  (10,-10)
 
��� ��10�� -10��
��������:һ���ַ���
�������:�������꣬��,�ָ�
ʾ��1
����
A10;S20;W10;D30;X;A1A;B10A11;;A10;
���
10,-10*/
public class CalculateCoordinate {
	public static final Pattern PATTERN = Pattern.compile("[A,W,S,D]\\d\\d?");

	public static void calculateCoordinate(String input) {
		String[] coordinates = input.split(";");
		int x = 0, y = 0;
		for (int i = 0; i < coordinates.length; i++) {
			if (!isCoordinate(coordinates[i]))
				continue;
			char ch = coordinates[i].charAt(0);
			int move = Integer.valueOf(coordinates[i].substring(1));
			switch (ch) {
			case 'A':
				x = x - move;
				break;
			case 'D':
				x = x + move;
				break;
			case 'W':
				y = y + move;
				break;
			case 'S':
				y = y - move;
				break;
			default:
				break;
			}
		}
		System.out.println(x + "," + y);
	}

	public static boolean isCoordinate(String coordinate) {
		Matcher matcher = PATTERN.matcher(coordinate);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			calculateCoordinate(input);
		}
		sc.close();
	}
}
