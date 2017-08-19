package com.jzf.primitive;

public class StackMemory {

	public static void main(String[] args) {
		String s1 = new StringBuilder("go").append("od").toString();
		System.out.println(s1.intern() == s1);
		String s2 = new StringBuilder("ja").append("va").toString();
		String s3=s2.intern();
		System.out.println(s2==s3);
		
	}

}
