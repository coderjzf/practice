package com.jzf.offer.array;

/*��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
  NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
public class MinNumberInRotateArray {
	public static int minNumberInRotateArray(int[] array) {
		int start = 0;
		int end = array.length - 1;
		while ((end - start) > 1) {
			int middle = (start + end) / 2;
			if (array[middle] >= array[start]) {
				start = middle;
			} else if (array[middle] <= array[end]) {
				end = middle;
			}
		}
		return array[end];
	}
}
