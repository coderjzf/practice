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
			Integer i = LOCAL.get();//每个线程都可以获得线程对应的变量的独立副本
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
