package com.jzf.therad;

class JoinThread extends Thread{
	
	
	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"��ʼ����");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println(Thread.currentThread().getName()+"��������");
	}
	
}

public class TestJoin {
	JoinThread joinThread = new JoinThread("���߳�");
	
}
