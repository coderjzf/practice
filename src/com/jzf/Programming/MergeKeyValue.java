package com.jzf.Programming;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���������ͬ��������ֵ����������㣬�������keyֵ������������
��������:
�������ֵ�Եĸ���
Ȼ������ɶԵ�index��valueֵ���Կո����
�������:
����ϲ���ļ�ֵ�ԣ����У�
ʾ��1
����

4
0 1
0 2
1 2
3 4
���

0 3
1 2
3 4*/
public class MergeKeyValue {
	public static void merge(String[] input) {
		String[] keyValue = new String[2];
		TreeMap<Integer, Integer> outPut = new TreeMap<>();
		for (int i = 0; i < input.length; i++) {
			keyValue = input[i].split(" ");
			String key = keyValue[0];
			String value = keyValue[1];
			if (outPut.containsKey(Integer.valueOf(key))) {
				outPut.put(Integer.valueOf(key), outPut.get(Integer.valueOf(key)) + Integer.valueOf(value));
			} else {
				outPut.put(Integer.valueOf(key), Integer.valueOf(value));
			}

		}
		Set<Entry<Integer, Integer>> set = outPut.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.print(entry.getKey() + " ");
			System.out.print(entry.getValue());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}
		merge(input);
		sc.close();
	}
}
