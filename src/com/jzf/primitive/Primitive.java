package com.jzf.primitive;

public class Primitive {

	public static void main(String[] args) {
		byte a = 127;
		float f = 3.4f;
		int s =    2100000000;
		//���������������δ��������������Ĭ��Ϊint�ͣ�����2200000000������int�͵����ݷ�Χ
		//long l = 2200000000;
		//����ɹ�����Ϊ��������Ϊlong�ͣ�����long�����ݷ�Χ֮��
		long l =   6000000000000000000l;
		
		char c = (char) 65536;
		byte b = 33;
		short sh = 588;
		//����ʧ�ܣ�char��short�������Զ�����ת��
		//char ch = sh;
		
		//�Զ���������(��ǿ������ת���������ֵ�����˽�С����ֵ�������ܱ�ʾ�����ݷ�Χ��
		//��Ϊ��ɾ�����ʧ(խ��)��������Ϊ�ض���ɵ�)
		int aa = 233;
		byte bb = (byte) aa;
		System.out.println(bb);
		
		
		//����Ҫ����ǿ������ת��
		/*
		 * int k = 3;
		 * int m = 4;
		 * byte by = k + m;
		 * 
		 */ 
		
		/*
		 * int ss = 1;
		 * byte byt = ss + 1;
		 */
		
		/*
		 *     ������ȷ����Ϊby+=1�൱��by = (byte)(by+1);
		 * 		byte by = 1;
				by+=1;
			
			      ����ʧ��
				byte by2 = 1;
				by2 = by2+1;
		 * 
		 * 
		 * 
		 * 
		 *
		 */
		
		

	}

}
