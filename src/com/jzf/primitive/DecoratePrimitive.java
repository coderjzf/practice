package com.jzf.primitive;

public class DecoratePrimitive {

	public static void main(String[] args) {
		Integer integer = new Integer(3);
		Integer integer2 = 3;//�Զ�װ��
		int i = 3;
		System.out.println(integer == integer2);//flase �Ƚϵ�������
		
		System.out.println(integer == i);//true integer�Զ������3���Ƚϵ���ֵ
		
		
		Integer f1=100,f2=100,f3=150,f4=150;
		Integer f5=new Integer(100);
		
		System.out.println(f1 == f2);//true 
		System.out.println(f3 == f4);//false
		System.out.println(f1 == f5);//flase
		
		System.out.println(Math.round(11.4));//���������ԭ���ǲ�������0.5Ȼ������ȡ����
		System.out.println(Math.round(-11.6));
		

	}

}
