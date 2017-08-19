package com.jzf.sort;

public class SortTest {
	private static final int[] INIT_ARRAY = { 25, 32, 99, 58, 11, 10, 45, 65, 32, 87, 12, 88, 66, 33 };

	private static final int[] ARRAY = { 9, 8, 7, 6, 5, 4, 3, 1, 2 };

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
	 * ���ֲ���
	 */
	public static int binarySearch(int[] a, int start, int end, int b) {
		int middle;
		while (start <= end) {
			middle = (start + end) / 2;
			if (b < a[middle]) {
				end = middle - 1;
			} else if (b > a[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		return 0;
	}

	/**
	 * ���ֲ������� ʱ�临�Ӷ�:o(n^2) ���ȶ������㷨
	 */
	public static void binarySort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int insertIndex = binarySearch(a, 0, i - 1, a[i]);
			int j;
			for (j = i - 1; j >= insertIndex; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}

	/**
	 * ֱ�Ӳ������� ʱ�临�Ӷ�o(n^2) �ȶ�����:��ԭʼ����ʱa[i]=a[j],a[i]��a[j]֮ǰ;�����,a[i]����a[j]֮ǰ
	 */
	public static void directInsertSort(int[] a) {
		int n = a.length;
		int i, j, temp = 0;
		for (i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				temp = a[i];// ������Ҫ�������
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];// ����ƶ�һλ
				}
				a[j + 1] = temp;
			}
		}
	}

	/**
	 * ϣ������ ��õ������ʱ�临�Ӷ�o(n^(3/2)) ��������Ծʽ�ģ������Ƿ��ȶ�����
	 * 
	 * @param a
	 */
	public static void shellSort2(int[] a) {
		int n = a.length;
		int gap = 0;
		int i = 0;
		int j = 0;
		int temp = 0;

		for (gap = n / 2; gap >= 1; gap /= 2) {//������n/2->1 ���һ������ֵ����Ϊ1
			for (i = gap; i < n; i++) {
				if (a[i] < a[i - gap]) {//���ͬ���ں�һ����С��ǰһ����
					temp = a[i];//������Ҫ���в����������
					for (j = i - gap; j >= 0 && a[j] > temp; j -= gap) {
						a[j + gap] = a[j];
					}
					a[j + gap] = temp;
				}
			}
		}
	}

	/**
	 * �������� ʱ�临�Ӷ�o(N*lgN) �����ȶ�����
	 */
	public static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int i = left;// ��߽�
			int j = right;// �ұ߽�
			int temp = a[i];// ��׼��
			while (i < j) {
				while (i < j && a[j] >= temp)// ��i=j��a[j]<��׼��ʱ�˳���������������С�ڻ�׼������
					j--;
				if (i < j)// ��i<j��������С�ڻ�׼�������ŵ���׼�����
					a[i++] = a[j];
				while (i < j && a[i] < temp)// ��i==j��a[i]>=��׼��ʱ�˳��������������Ҵ��ڵ��ڻ�׼������
					i++;
				if (i < j)// ��i<j�������򽫴��ڵ��ڻ�׼�������ŵ���׼���ұ�
					a[j--] = a[i];
			}
			a[i] = temp;// ����׼���������λ��
			quickSort(a, left, i - 1);// �ݹ������׼����ߵ�����
			quickSort(a, i + 1, right);// �ݹ������׼���ұߵ�����
		}
	}

	/**
	 * ������ð������:��Ϊÿ�β��������ڵ�����֮��Ƚϴ�С
	 * 
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
	 * 
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

	/**
	 * ��ѡ������ ˼��:ͨ��n�α�����������,��ÿ�α����õ�����С(�����)����������������Ŀ�ͷ(ĩβ)
	 * ��һ�α����õ���С�������������һ��λ��(���������γ�),ֱ��ȫ���������� ʱ�临�Ӷ�:o(n^2)
	 */
	public static void selectSort(int[] a) {
		int n = a.length;
		int minIndex = 0;
		for (int i = 0; i < n; i++) {
			minIndex = i;// ÿ�ο�ʼ�������飬����i��������С
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[minIndex]) {// ���a[j]С����С��������¼������ֵj
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(a, minIndex, i);
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * for (int i : INIT_ARRAY) { System.out.print(i + " "); }
		 * System.out.println(); binarySort(INIT_ARRAY); for (int i :
		 * INIT_ARRAY) { System.out.print(i + " "); }
		 */
		/*
		 * System.out.println(binarySearch(INIT_ARRAY, 0, INIT_ARRAY.length - 1,
		 * 66));
		 */

		// bubbleSort2(ARRAY);
		// primaryBubbleSort(INIT_ARRAY);
		// directInsertSort(INIT_ARRAY);
		shellSort2(ARRAY);
		for (int i : ARRAY) {
			System.out.print(i + " ");
		}
	}
}
