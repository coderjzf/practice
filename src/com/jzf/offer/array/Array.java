package com.jzf.offer.array;

public class Array {
	
	/*��Ŀ����
	     ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
	     ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
	*/
	public boolean solution(int target,int[][]array){
		int rows = array.length;
		int cols = array[0].length;
		int row = 0;
		int col = cols;
		while(row<=rows && col>=0){
			if(target == array[row][col]){
				return true;
			}else if(target< array[row][col]){
				col--;
			}else{
				row++;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		

	}

}
