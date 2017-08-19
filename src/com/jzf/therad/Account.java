package com.jzf.therad;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private double balance; // �˻����
	private Lock lock = new ReentrantLock();

	/**
	 * ���
	 * 
	 * @param money
	 *            ������
	 */
	public void deposit(double money) {
		lock.lock();
		try {
			double newBalance = balance + money;
			try {
				Thread.sleep(10); // ģ���ҵ����Ҫһ�δ���ʱ��
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			balance = newBalance;
		} finally {
			lock.unlock();
		}

	}

	/**
	 * ����˻����
	 */
	public double getBalance() {
		return balance;
	}
}
