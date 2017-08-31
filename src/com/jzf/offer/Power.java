package com.jzf.offer;

import java.util.Scanner;

public class Power {
    public static double power(double base, int exponent) {
        if(base == 0){
            return 0;
        }
        
        boolean flag = true;
        int result = 1;
        
        if(exponent<0){
        	flag = false;
        }else if(exponent==0){
        	return 1;
        }
        for(int i = 1 ;i<=Math.abs(exponent);i++){
        	result*=base;
        }
        
        if(!flag){
        	return 1.0/result;
        }
        return result;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		System.out.println(power(base, exponent));
		sc.close();
	}

}
