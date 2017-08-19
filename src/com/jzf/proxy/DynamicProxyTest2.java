package com.jzf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest2 {

	public static void main(String[] args) {
		FlyBehavior bird = new Bird();
		
		ClassLoader loader = bird.getClass().getClassLoader();
		Class[] interfaces = bird.getClass().getInterfaces();
		
		InvocationHandler h = new DynamicProxy(bird);
		FlyBehavior fly= (FlyBehavior) Proxy.newProxyInstance(loader, interfaces, h);
		
		System.out.println(fly.getClass().getName());
		fly.fly();
		System.out.println("-------------");
		System.out.println(fly.getClass().getName());
		fly.fly("2000");
	}
}
