package com.jzf.therad;

class TestThread implements Runnable {
	private int i;

	public TestThread( int i) {
		this.i = i;
	}

	@Override
	public void run() {
		for (int j = 0; j < i; j++) {
			if(i>0){
				System.out.println("Thread[" + Thread.currentThread().getName() + "]: " + i--);
			}
		}
	}

}

public class RunnableCompareThread {
	public static void main(String[] args) {
		TestThread testThread = new TestThread(10);
		new Thread(testThread,"A").start();
		new Thread(testThread,"B").start();
	
	}
}
