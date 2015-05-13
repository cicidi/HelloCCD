package com.cicidi.multithread.cn.itcast.heima2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionCommunication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Business business = new Business();
		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 1; i <= 10; i++) {
					business.sub(i);
				}

			}
		}).start();

		for (int i = 11; i <= 20; i++) {
			business.main(i);
		}

	}

	static class Business {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		private boolean bShouldSub = true;

		public void sub(int i) {
			lock.lock();
			try {
				while (!bShouldSub) {
					try {
						condition.await();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for (int j = 21; j <= 30; j++) {
					System.out.println("sub thread sequence of " + j
							+ ",loop of " + i + "    "
							+ Thread.currentThread().getName());
				}
				bShouldSub = false;
				condition.signal();
			} finally {
				lock.unlock();
			}
		}

		public void main(int i) {
			lock.lock();
			try {
				while (bShouldSub) {
					try {
						condition.await();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for (int j = 31; j <= 40; j++) {
					System.out.println("main thread sequence of " + j
							+ ",loop of " + i + "    "
							+ Thread.currentThread().getName());
				}
				bShouldSub = true;
				condition.signal();
			} finally {
				lock.unlock();
			}
		}

	}
}
