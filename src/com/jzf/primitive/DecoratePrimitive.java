package com.jzf.primitive;

public class DecoratePrimitive {

	public static void main(String[] args) {
		Integer integer = new Integer(3);
		Integer integer2 = 3;//自动装箱
		int i = 3;
		System.out.println(integer == integer2);//flase 比较的是引用
		
		System.out.println(integer == i);//true integer自动拆箱成3，比较的是值
		
		
		Integer f1=100,f2=100,f3=150,f4=150;
		Integer f5=new Integer(100);
		
		System.out.println(f1 == f2);//true 
		System.out.println(f3 == f4);//false
		System.out.println(f1 == f5);//flase
		
		System.out.println(Math.round(11.4));//四舍五入的原理是参数加上0.5然后向下取整！
		System.out.println(Math.round(-11.6));
		

	}

}
