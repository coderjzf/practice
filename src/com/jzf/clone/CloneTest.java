package com.jzf.clone;

public class CloneTest {

	public static void main(String[] args) {
/*		User user = new User();
		Address address = new Address("����", "��ɽ");
		user.setAddress(address);
		
		User user2 = (User) user.clone();
		
		System.out.println(user);
		System.out.println(user2);
		
		address.setProvince("����");
		address.setCity("����");
		
		System.out.println(user); //�������� 
		System.out.println(user2);//��������   ԭ����ǳ���ƣ�ֻ������address�����ã�����User������Ȼָ��ͬһ��address */
		
		User user = new User();
		Address address = new Address("����", "��ɽ");
		user.setAddress(address);
		
		User user2 = (User) user.clone();
		
		System.out.println(user);
		System.out.println(user2);//ͨ����addressҲʵ��Cloneable�ӿڣ�����дclone��������ʵ�����¡
		
		address.setProvince("����");
		address.setCity("����");
		
		System.out.println(user); 
		System.out.println(user2);
		
	}

}
