package com.jzf.therad;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private double balance; // 账户余额
	private Lock lock = new ReentrantLock();

	/**
	 * 存款
	 * 
	 * @param money
	 *            存入金额
	 */
	public void deposit(double money) {
		lock.lock();
		try {
			double newBalance = balance + money;
			try {
				Thread.sleep(10); // 模拟此业务需要一段处理时间
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			balance = newBalance;
		} finally {
			lock.unlock();
		}

	}

	/**
	 * 获得账户余额
	 */
	public double getBalance() {
		return balance;
	}
}
