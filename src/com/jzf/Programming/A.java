package com.jzf.Programming;

public class A {
	
	public int max(int a,int b){
		return 0;
	}
	
	public float max(float a,float b){
		return 0;
	}
	
	public static void main(String[] args) {
		B b = new B();
		int y = 0;
		int i = 3;
		y = (int) i;
	}
}
class B extends A{
	final A a = null;
}
class C extends B{
	
}
