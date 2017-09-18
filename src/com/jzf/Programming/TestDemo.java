package com.jzf.Programming;

public class TestDemo {
	private int count;

	public static void main(String[] args) {
		TestDemo test = new TestDemo(88);
		System.out.println(test.count);
		String x = "7";
		int y = 2;
		int z = 2;
		System.out.println(x+y+z);
		int a = 1;
		float b = 2;
		System.out.println(a/b);
	}

	TestDemo(int a) {
		count = a;
	}
}

abstract class AA {
}

abstract class BB extends AA {

}
