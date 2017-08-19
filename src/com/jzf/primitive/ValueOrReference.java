package com.jzf.primitive;

class User {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class ValueOrReference {
   
	public static void change(String s){
		s="hello";
		//return s.substring(1);
	}

	public static void change(User user)
	{
		user.setAge(20);//�ı���ԭ���������
		user=new User();//����ָ�����µĶ�����ԭ����Ͽ�����ϵ
		user.setAge(22);
	}

	public static void change(int a) {
		a = 50;
	}

	public static void change(int[] b) {
		b[0] = 100;
	}

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);//10
		change(a);
		System.out.println(a);//10

		int[] b = { 50, 50 };
		System.out.println(b[0]);//50
		change(b);
		System.out.println(b[0]);//100
		
		User user = new User();
		user.setAge(18);
		System.out.println(user.getAge());//18
		change(user);
		System.out.println(user.getAge());//20
		
		String s=new String("haha");
		System.out.println(s);
		change(s);
		System.out.println(s);//haha
	}
}
