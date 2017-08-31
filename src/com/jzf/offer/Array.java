package com.jzf.offer;

public class Array {
	
	/*题目描述
	     在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	     每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
