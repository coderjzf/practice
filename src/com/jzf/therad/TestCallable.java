package com.jzf.therad;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class MyTask implements Callable<Integer>{
	private Integer i;
	
	public MyTask(Integer i){
		this.i = i;
	}
	
	@Override
	public Integer call() throws Exception {
		return i;
	}
	
}

public class TestCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		ArrayList<Future<Integer>> arrayList = new ArrayList<>();
		for(int i = 0 ; i< 10 ; i ++){
			arrayList.add(executorService.submit(new MyTask(3)));
		}
		
		int sum=0;
		for(Future future : arrayList){
			sum+=(Integer)future.get();
		}
		System.out.println(sum);
	}
}
