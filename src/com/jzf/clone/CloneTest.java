package com.jzf.clone;

public class CloneTest {

	public static void main(String[] args) {
/*		User user = new User();
		Address address = new Address("安徽", "马鞍山");
		user.setAddress(address);
		
		User user2 = (User) user.clone();
		
		System.out.println(user);
		System.out.println(user2);
		
		address.setProvince("江苏");
		address.setCity("徐州");
		
		System.out.println(user); //江苏徐州 
		System.out.println(user2);//江苏徐州   原因是浅复制，只复制了address的引用，两个User对象仍然指向同一个address */
		
		User user = new User();
		Address address = new Address("安徽", "马鞍山");
		user.setAddress(address);
		
		User user2 = (User) user.clone();
		
		System.out.println(user);
		System.out.println(user2);//通过让address也实现Cloneable接口，并重写clone方法，可实现深克隆
		
		address.setProvince("江苏");
		address.setCity("徐州");
		
		System.out.println(user); 
		System.out.println(user2);
		
	}

}
