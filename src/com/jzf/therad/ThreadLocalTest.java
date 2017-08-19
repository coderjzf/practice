package com.jzf.therad;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {
	static final ThreadLocal<Integer> LOCAL = new ThreadLocal<Integer>(){

		@Override
		protected Integer initialValue() {
			return 0;
		}
		
	};
	
	static class ThreadUnit implements Runnable{
		private int num;
		
		@Override
		public void run() {
			Integer i = LOCAL.get();//ÿ���̶߳����Ի���̶߳�Ӧ�ı����Ķ�������
			while(++i<10);
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
	public static void main(String[] args) {
		
	/*	ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=0;i<5;i++){
			executorService.execute(new Thread(new ThreadUnit()));
		}
		executorService.shutdown();*/
		System.out.println(ThreadLocalTest.LOCAL);
	}
}
