package com.jzf.search;

public class SearchTest {

	public static void fibonaccl() {
		int[] a = new int[40];
		a[0] = 0;
		a[1] = 1;
		int i;
		for (i = 2; i < 40; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 0; i < 40; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int fibonaccl2(int n){
		if(n<2){
			return n==0?0:1;
		}
		return fibonaccl2(n-1)+fibonaccl2(n-2);
	}

	public static void main(String[] args) {
		fibonaccl();
		System.out.println();
		for(int n = 0;n<40;n++){
			System.out.print(fibonaccl2(n)+" ");
		}
	}
}
