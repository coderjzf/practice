package com.jzf.offer.string;

public class ReverseString {
	public static String reverse(String str) {
		if(str==null || str.equals("") || str.trim().length()==0)
			return str;
		String[] strs = str.split(" ");
		StringBuffer outPut = new StringBuffer();
		for (int i = strs.length - 1; i >= 0; i--) {
			String last = strs[i];
			outPut.append(last);
			if (i != 0)
				outPut.append(" ");
		}
		return outPut.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse(" "));
	}
}
