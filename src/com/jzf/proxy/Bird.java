package com.jzf.proxy;

public class Bird implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I Can Fly!");
	}

	@Override
	public void fly(String str) {
		System.out.println("I Can Fly To "+str+" Meters!");
	}

}
