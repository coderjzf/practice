package com.jzf.offer;

/*��Ŀ����
дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�*/
public class Add {
	public static int add(int num1, int num2) {
		int sum = 0;
		int carray = 0;
		do {
			sum = (num1 ^ num2);//�൱����������ӣ����ǲ���λ
			carray = (num1 & num2)<<1;//���½�λ
			num1 = sum;
			num2 = carray;
		} while (num2 != 0);//��û�н�λʱ���������

		return sum;
	}
	public static void main(String[] args) {
		add(5, 17);
	}
}
