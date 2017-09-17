package com.jzf.offer.string;

public class LeftRotateString {
	public String leftRotateString(String str, int n) {
		if (n > str.length())
			throw new RuntimeException("n大于字符串长度！");
		if (str == null || str.length() == 0)
			return str;
		StringBuffer sb = new StringBuffer(str);
		String left = sb.substring(0, n - 1);
		sb.delete(0, n - 1);
		sb.append(left);
		return sb.toString();
	}
}
