package com.jzf.sort;

public class BubbleSortDemo {
	
	/**
	 * ��������a������i,j����ֵ
	 */
	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("�����±�Խ�磡");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * ������ð������:��Ϊÿ�β��������ڵ�����֮��Ƚϴ�С
	 * @param a
	 */
	public static void primaryBubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {// n��ѭ����ÿ�ν���i��/С�����ŵ�i��λ��
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
	}

	/**
	 * ð������ ʱ�临�Ӷ�o(n^2) �ȶ�����:��
	 */
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {// ��n�α������飬�Ὣ��n��/С�����ź���
				if (a[j] > a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}

	/**
	 * ð�������Ż�:����������󣬲��ڽ��ж����ѭ��
	 * @param a
	 */
	public static void bubbleSort2(int[] a) {
		int n = a.length;
		boolean flag = true;
		for (int i = 0; i < n && flag; i++) {
			flag = false;
			for (int j = n - 1; j > i; j--) {
				if (a[j] > a[j - 1]) {
					swap(a, j, j - 1);
					flag = true;
				}
			}
		}
	}
}
