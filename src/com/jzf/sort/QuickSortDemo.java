package com.jzf.sort;

public class QuickSortDemo {
	/**
	 * 交换数组a中索引i,j处的值
	 */
	public static void swap(int[] a, int i, int j) {
		if ((i < 0 || i > a.length) || (j < 0 || j > a.length))
			throw new IndexOutOfBoundsException("数组下标越界！");
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * 寻找基准值的索引
	 * @param a
	 * @param low
	 * @param high
	 * @return 返回基准值索引
	 */
	public static int partition(int[] a, int low, int high) {
		// 选取第一条记录作为基准值
		int pivotkey = a[low];
		// 将基准值交替与左边、右边的记录相比较
		while (low < high) {
			// 如果基准值右边的记录大于等于基准值，则继续循环;否则交换值
			while (low < high && a[high] >= pivotkey) {
				high--;
			}
			swap(a, low, high);
			// 如果基准值左边的记录小于等于基准值，则继续循环;否则交换值
			while (low < high && a[low] <= pivotkey) {
				low++;
			}
			swap(a, low, high);
		}
		return low;
	}
	
	/**
	 * 寻找基准值索引的改进方法:减少交换次数
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public static int partition2(int[] a,int low,int high){
		// 选取第一条记录作为基准值
		int pivotkey = a[low];
		// 将基准值交替与左边、右边的记录相比较
		while (low < high) {
			// 如果基准值右边的记录大于等于基准值，则继续循环;否则将右边的记录移动到左边
			while (low < high && a[high] >= pivotkey) {
				high--;
			}
			a[low] = a[high];
			// 如果基准值左边的记录小于等于基准值，则继续循环;否则将左边的记录移动到右边
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
	 * 快速排序
	 * 1.选择一个基准值，将待排序记录分割成两部分，左边部分的记录小于等于基准值，右边部分的记录大于等于基准值
	 * 2.重复步骤1直到所有记录有序
	 * 非稳定排序
	 * 时间复杂度为o(nlgn)
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] a, int low, int high) {
		int pivot = 0;// 基准值索引
		if (low < high) {
			pivot = partition(a, low, high);
			quickSort(a, low, pivot - 1);//对基准值左边的记录递归排序
			quickSort(a, pivot + 1, high);//对基准值右边的记录递归排序
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
