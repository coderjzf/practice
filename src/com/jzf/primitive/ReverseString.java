package com.jzf.primitive;

import java.io.UnsupportedEncodingException;

public class ReverseString {
	
	//ʵ���ַ�����ת
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1) 
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
    
    public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(reverse("test"));
		
		String s1 = "���";
		String s2 = new String(s1.getBytes("GBK"),"ISO-8859-1");
	}
}
