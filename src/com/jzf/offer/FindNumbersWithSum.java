package com.jzf.offer;

import java.util.ArrayList;

/*����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S��
 * ����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
�������:
��Ӧÿ�����԰����������������С���������*/
public class FindNumbersWithSum {
	/*ʱ�临�Ӷ�o(n)*/
	public static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> outPut = new ArrayList<>();
		if (array == null || array.length == 0 || sum < 0)
			return outPut;

		int small = 0;
		int big = array.length - 1;
		while (small < big) {
			int result = array[small] + array[big];
			if (result == sum) {
				if (!outPut.isEmpty()) {
					// ����˻��ϴ� �����ѭ��
					if (outPut.get(0) * outPut.get(1) <= array[small] * array[big]) {
						small++;
						continue;
					} else {
						outPut.remove(0);
						outPut.remove(0);
					}
				}
				outPut.add(array[small]);
				outPut.add(array[big]);
				small++;
			} else if (result > sum) {
				big--;
			} else {
				small++;
			}
		}
		return outPut;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayList<Integer> output = findNumbersWithSum(array, 7);
		System.out.print(output.get(0)+" "+output.get(1));
	}
}
