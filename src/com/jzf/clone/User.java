package com.jzf.clone;

public class User implements Cloneable {
	private String name;
	private int age;
	private Address address;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Object clone() {
		User user = null;
		try {
			user = (User) super.clone();
			/*实现深克隆*/
			if(user.address!=null){
				user.address = (Address) address.clone();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
