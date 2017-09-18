package com.jzf.offer.array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*��Ŀ����
һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�*/
public class FindNumsAppearOnce {
	public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length == 0)
			return;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], 2);
			}
		}

		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			Integer value = entry.getValue();
			if (value == 1 && num1[0] == 0) {
				num1[0] = entry.getKey();
			} else if (value == 1 && num1[0] != 0) {
				num2[0] = entry.getKey();
			}
		}
	}

	/* �����ķ��� ������ͬ����������0 һ������0�����ڱ��� */

	public static void findNumsAppearOnce2(int[] array, int[] num1, int[] num2) {
		int result = 0;
		// ����������Ľ��
		// ������ͬ�����������Ľ��Ϊ0 ���Դ˽��������ֻ�������ε������Ľ��
		for (int i : array) {
			result ^= i;
		}

		// �ҵ����Ľ���д��������һ��1��λ��
		int indexOfBitIs1 = findIndexOfBitIs1(result);

		// ���ݴ�������nλΪ1��0���������Ϊ����
		// ÿһ������һ��ֻ����һ�ε��������ɶԳ������ε���
		for (int i : array) {
			if (isBit1(i, indexOfBitIs1)) {
				num1[0] ^= i;
			} else {
				num2[0] ^= i;
			}
		}
	}

	public static int findIndexOfBitIs1(int num) {
		int flag = 1;
		int count = 0;
		while (flag != 0) {
			count++;
			if ((num & flag) != 0) {
				break;
			}
			flag = flag << 1;
		}
		return count;
	}

	public static boolean isBit1(int num, int indexOfBitIs1) {
		int flag = 1;
		flag = flag << indexOfBitIs1 - 1;
		if ((num & flag) != 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		/*
		 * int[] array = { 1, 1, 2, 3, 4, 4, 5, 5, 6, 2, 6, 8 }; int[] num1 =
		 * new int[1]; int[] num2 = new int[1]; findNumsAppearOnce(array, num1,
		 * num2); System.out.println(num1[0] + " " + num2[0]);
		 */
		int[] array = { 1, 1, 2, 3, 4, 4,2,5};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		findNumsAppearOnce2(array,num1,num2);
		System.out.println(num1[0]+" "+num2[0]);
	}
}
