package com.jzf.decoration;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = Integer.decode("0x12");
		Integer i2 = Integer.decode("-012");
		Integer i3 = Integer.decode("-12");
		Integer i4 = Integer.decode("-#12");
		Integer i5 = Integer.decode("0X12");
		Integer i6 = Integer.decode("12");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		System.out.println("-----------------------");
		
		System.out.println(Integer.toString(11));
		System.out.println(Integer.toString(11,2));
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toHexString(11));
		System.out.println(Integer.toUnsignedString(11));
		
		
/*		��ΪStringʵ����Serializable�ӿڣ�����֧�����л��ͷ����л�֧�֡�
		Java�����л�������ͨ��������ʱ�ж����serialVersionUID����֤�汾һ���Եġ�
		�ڽ��з����л�ʱ��JVM��Ѵ������ֽ����е�serialVersionUID�뱾����Ӧʵ�壨�ࣩ��serialVersionUID���бȽϣ�
		�����ͬ����Ϊ��һ�µģ����Խ��з����л�������ͻ�������л��汾��һ�µ��쳣(InvalidCastException)��*/
	}

}









