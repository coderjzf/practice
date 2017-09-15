package com.jzf.offer.array;

import java.util.HashMap;

/*
 ��Ŀ����
��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
 ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
 Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
 ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 */
public class FindDuplication {
	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	// otherwise false
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean flag = false;
		for (int i = 0; i < length; i++) {
			if (!map.containsKey(numbers[i])) {
				map.put(numbers[i], i);
			} else {
				duplication[0] = numbers[i];
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static boolean duplicate2(int numbers[], int length, int[] duplication) {
		if (numbers == null || length == 0)
			return false;

		for (int i = 0; i < length; i++) {
			if (numbers[i] < 0 || numbers[i] > length - 1)
				return false;
		}

		boolean flag = false;
		for (int i = 0; i < length; i++) {
			// �����iλ��������i
			while (numbers[i] != i) {
				// �����iλ��m=numbers[i]���ڵ�mλ�ϵ��������ҵ��ظ�����
				if (numbers[i] == numbers[numbers[i]]) {
					flag = true;
					duplication[0] = numbers[i];
					break;
					// ���򽻻��������������Ƚ�
				}
				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 5, 8 };
		int[] duplication = new int[1];
		System.out.println(duplicate2(numbers, numbers.length, duplication));
	}
}
