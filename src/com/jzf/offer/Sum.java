package com.jzf.offer;

/*��Ŀ����
��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��*/
public class Sum {
	public int getSum(int n){
		int sum = n;
		boolean answer = n>0 && (sum+=getSum(n-1))>0;
		return sum;
	}
}
