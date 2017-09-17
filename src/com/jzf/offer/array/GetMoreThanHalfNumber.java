package com.jzf.offer.array;

/*��Ŀ����
��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��*/
public class GetMoreThanHalfNumber {
	public static int getMoreThanHalfNumber(int[] array) {
		if (array == null)
			return 0;
		int low = 0;
		int high = array.length - 1;
		int index = partition(array, low, high);
		int middle = array.length / 2;
		/**
		 * ���ִ����������鳤��һ���������"����"��������λ�����������������Ǹ���
		 * ����partition������ѡȡ��׼ֵpivotkey��ʹ�û�׼ֵ��ߵ�����С�ڵ���������׼ֵ�ұߵ��������ڵ�����
		 * ����õ��Ļ�׼ֵ������С��middle,����λ��λ�ڻ�׼ֵ�ұߣ��������ұ߲���
		 * ����õ��Ļ�׼ֵ�����д���middle,����λ��λ�ڻ�׼ֵ��ߣ���������߲���
		 */
		while (index != middle) {
			if (index < middle) {
				low = low + 1;
				index = partition(array, low, high);
			} else {
				high = high - 1;
				index = partition(array, low, high);
			}
		}
		int result = array[middle];
		if (!checkIfMoreThanHalf(array, result))
			return 0;
		return result;
	}

	public static boolean checkIfMoreThanHalf(int[] array, int num) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				count++;
		}
		if (count <= array.length / 2)
			return false;
		return true;
	}

	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("�����±�Խ�磡");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int low, int high) {
		int pivotkey = a[low];

		while (low < high) {
			while (low < high && a[high] >= pivotkey)
				high--;
			swap(a, low, high);
			while (low < high && a[low] <= pivotkey)
				low++;
			swap(a, low, high);
		}

		return low;
	}
	public static void main(String[] args) {
		int[] array = {5,2,2,3,4,2,2,2,2};
		System.out.println(getMoreThanHalfNumber(array));
	}
}
