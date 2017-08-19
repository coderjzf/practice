package com.jzf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		FlyBehavior bird = new Bird();
		
		ClassLoader loader = FlyBehavior.class.getClassLoader();
		Class[] interfaces = Bird.class.getInterfaces();
		
		FlyBehavior fly = (FlyBehavior) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			
				System.out.println("executing method: "+method.getName()+",parameters: "
						+method.getParameterCount());
				method.invoke(bird, args);
				return null;
			}
		});
		
		System.out.println(fly.getClass().getName());
		fly.fly("2000");
	}

}
