package com.jzf.offer;

public class Fibonacci {
	/*�ݹ鷨*/
	public int fibonacci(int n) {
		if (n < 1) {
			throw new RuntimeException("n��횞�������!");
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/*������*/
	public int fibonacci2(int n){
		if (n < 1) {
			throw new RuntimeException("n��횞�������!");		}
		if (n == 1 || n == 2) {
			return 1;
		}
		int f = 1;
		int g = 1;
		for(int i =3;i<=n;i++){
			f += g;
			g = f - g;
		}
		return f;
	}
}
