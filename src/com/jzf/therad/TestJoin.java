package com.jzf.therad;

class JoinThread extends Thread{
	
	
	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"开始运行");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println(Thread.currentThread().getName()+"结束运行");
	}
	
}

public class TestJoin {
	JoinThread joinThread = new JoinThread("子线程");
	
}
