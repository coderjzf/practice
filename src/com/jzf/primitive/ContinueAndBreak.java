package com.jzf.primitive;

public class ContinueAndBreak {

	public static void main(String[] args) {
		int count=0;
		for(int j=0;j<5;j++){
			ok:for(int k =0;k<5;k++){
				for(int m=0;m<5;m++){
				count++;
				if(count==3){
					break ok;//����ָ����ǩ������ִֹͣ���ڲ�ѭ��
					//continue ok; //������ǩ����������ִ��ѭ��
				}
				}
			}
		}
		
		int a=5;
		System.out.println(count);

	}

}
