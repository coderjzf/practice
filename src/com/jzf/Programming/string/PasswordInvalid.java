package com.jzf.Programming.string;

import java.util.Scanner;

/*题目描述
密码要求:
1.长度超过8位
 
2.包括大小写字母.数字.其它符号,以上四种至少三种
 
3.不能有相同长度超2的子串重复
 
说明:长度超过2的子串
输入描述:一组或多组长度超过2的子符串。每组占一行
输出描述:如果符合要求输出：OK，否则输出NG
示例1
输入
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000
输出
OK
NG
NG
OK*/
public class PasswordInvalid {
	public static boolean passwordInvalid(String password) {
		if (password == null && password.length() < 8) {
			return false;
		}
		if (!statistic(password)) {
			return false;
		} else {
			if (isDulicated(password)) {
				return false;
			} else {
				return true;
			}
		}
	}

	public static boolean statistic(String password) {
		char[] chars = password.toCharArray();
		int[] count = new int[4];
		for (char ch : chars) {
			if (ch >= '0' && ch <= '9') {
				count[0] = 1;
			} else if (ch >= 'a' && ch <= 'z') {
				count[1] = 1;
			} else if (ch >= 'A' && ch <= 'Z') {
				count[2] = 1;
			} else {
				count[3] = 1;
			}
		}
		int sum = 0;
		for (int i : count) {
			sum += i;
		}
		if (sum >= 3) {
			return true;
		}
		return false;
	}

	public static boolean isDulicated(String password) {
		for (int i = 0; i < password.length() - 2; i++) {
			if (password.substring(i + 3).contains(password.substring(i, i + 3))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String password = sc.nextLine();
			boolean b = passwordInvalid(password);
			if(b){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
		sc.close();
	}
}
