package com.jzf.Programming;

import java.util.ArrayList;
import java.util.Scanner;

/*功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
最后一个数后面也要有空格

详细描述：

函数接口说明：
public String getResult(long ulDataInput)
输入参数：
long ulDataInput：输入的正整数
返回值：
String*/
/*
 * 
 * 1.若一个数n是质数，则直接输入这个质数
 * 2.从i=2开始,n%2==0则结束;否则用n%下一个质数...
 * 48
 */
public class PrimeFactor {
	public static void getPrimeFactor(long input) {
		ArrayList<Long> list = new ArrayList<>();
		long temp = input;
		
		if(isPrime(input)){
			System.out.println(input+" ");
			return;
		}
		
		for (long i = 2; i <= input / 2; i++) {
			if (!isPrime(i)) {
				continue;
			}
			while (temp % i == 0) {
				list.add(i);
				temp = temp / i;
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPrime(long number) {
		if (number == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long input = sc.nextLong();
			getPrimeFactor(input);
		}
		sc.close();
	}
}
