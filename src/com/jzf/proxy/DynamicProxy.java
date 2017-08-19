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

		// ͨ���������ִ�б��������ķ���
		method.invoke(bird, args);

		return null;
	}

}
