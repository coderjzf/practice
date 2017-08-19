package com.jzf.primitive;

public class ContinueAndBreak {

	public static void main(String[] args) {
		int count=0;
		for(int j=0;j<5;j++){
			ok:for(int k =0;k<5;k++){
				for(int m=0;m<5;m++){
				count++;
				if(count==3){
					break ok;//跳到指定标签处，并停止执行内层循环
					//continue ok; //跳到标签处，并继续执行循环
				}
				}
			}
		}
		
		int a=5;
		System.out.println(count);

	}

}
