package com.jzf.primitive;

import java.io.UnsupportedEncodingException;

public class ReverseString {
	
	//实现字符串反转
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1) 
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
    
    public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(reverse("test"));
		
		String s1 = "你好";
		String s2 = new String(s1.getBytes("GBK"),"ISO-8859-1");
	}
}
