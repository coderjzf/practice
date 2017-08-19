package com.jzf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private FlyBehavior bird;

	public DynamicProxy(FlyBehavior bird) {
		this.bird = bird;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("executing method: " + method.getName() + 
				",parameters: " + method.getParameterCount());

		// 通过反射机制执行被代理对象的方法
		method.invoke(bird, args);

		return null;
	}

}
