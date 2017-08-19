package com.jzf.sort;

public class QuickSortDemo {
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
	 * Ѱ�һ�׼ֵ������
	 * @param a
	 * @param low
	 * @param high
	 * @return ���ػ�׼ֵ����
	 */
	public static int partition(int[] a, int low, int high) {
		// ѡȡ��һ����¼��Ϊ��׼ֵ
		int pivotkey = a[low];
		// ����׼ֵ��������ߡ��ұߵļ�¼��Ƚ�
		while (low < high) {
			// �����׼ֵ�ұߵļ�¼���ڵ��ڻ�׼ֵ�������ѭ��;���򽻻�ֵ
			while (low < high && a[high] >= pivotkey) {
				high--;
			}
			swap(a, low, high);
			// �����׼ֵ��ߵļ�¼С�ڵ��ڻ�׼ֵ�������ѭ��;���򽻻�ֵ
			while (low < high && a[low] <= pivotkey) {
				low++;
			}
			swap(a, low, high);
		}
		return low;
	}
	
	/**
	 * Ѱ�һ�׼ֵ�����ĸĽ�����:���ٽ�������
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public static int partition2(int[] a,int low,int high){
		// ѡȡ��һ����¼��Ϊ��׼ֵ
		int pivotkey = a[low];
		// ����׼ֵ��������ߡ��ұߵļ�¼��Ƚ�
		while (low < high) {
			// �����׼ֵ�ұߵļ�¼���ڵ��ڻ�׼ֵ�������ѭ��;�����ұߵļ�¼�ƶ������
			while (low < high && a[high] >= pivotkey) {
				high--;
			}
			a[low] = a[high];
			// �����׼ֵ��ߵļ�¼С�ڵ��ڻ�׼ֵ�������ѭ��;������ߵļ�¼�ƶ����ұ�
			while (low < high && a[low] <= pivotkey) {
				low++;
			}
			a[high] = a[low];
			swap(a, low, high);
		}
		a[low] = pivotkey;
		return low;
	}
	
	/**
	 * ��������
	 * 1.ѡ��һ����׼ֵ�����������¼�ָ�������֣���߲��ֵļ�¼С�ڵ��ڻ�׼ֵ���ұ߲��ֵļ�¼���ڵ��ڻ�׼ֵ
	 * 2.�ظ�����1ֱ�����м�¼����
	 * ���ȶ�����
	 * ʱ�临�Ӷ�Ϊo(nlgn)
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] a, int low, int high) {
		int pivot = 0;// ��׼ֵ����
		if (low < high) {
			pivot = partition(a, low, high);
			quickSort(a, low, pivot - 1);//�Ի�׼ֵ��ߵļ�¼�ݹ�����
			quickSort(a, pivot + 1, high);//�Ի�׼ֵ�ұߵļ�¼�ݹ�����
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 11, 22, 5, 9, 26, 3, 30, 16, 1 };
/*		quickSort(a, 0, a.length - 1);
		for(int i : a){
			System.out.print(i+" ");
		}*/
		
		partition2(a, 0, a.length-1);
		for(int i : a){
			System.out.print(i+" ");
		}
	}
}
