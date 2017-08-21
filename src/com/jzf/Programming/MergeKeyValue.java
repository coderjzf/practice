package com.jzf.Programming;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
输入描述:
先输入键值对的个数
然后输入成对的index和value值，以空格隔开
输出描述:
输出合并后的键值对（多行）
示例1
输入

4
0 1
0 2
1 2
3 4
输出

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
