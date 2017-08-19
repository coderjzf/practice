package com.jzf.primitive;

public class Primitive {

	public static void main(String[] args) {
		byte a = 127;
		float f = 3.4f;
		int s =    2100000000;
		//编译出错，整型数据未声明数据类型则默认为int型，但是2200000000超出了int型的数据范围
		//long l = 2200000000;
		//编译成功，因为数据声明为long型，且在long型数据范围之内
		long l =   6000000000000000000l;
		
		char c = (char) 65536;
		byte b = 33;
		short sh = 588;
		//编译失败，char和short不进行自动类型转换
		//char ch = sh;
		
		//自动类型提升(即强制类型转换，如果数值超过了较小的数值类型所能表示的数据范围，
		//则为造成精度损失(窄化)，这是因为截断造成的)
		int aa = 233;
		byte bb = (byte) aa;
		System.out.println(bb);
		
		
		//都需要进行强制类型转化
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
		 *     编译正确，因为by+=1相当于by = (byte)(by+1);
		 * 		byte by = 1;
				by+=1;
			
			      编译失败
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
