package com.cicidi.multithread.cn.itcast.heima2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
之前main 和sub 两个方法之间没有切换成功，主要是因为condition 之前在方法里initial 了  而不是在class 里面initial的 
 *
 */
public class ConditionCommunication_cicidi {

	public static void main(String arg[]) {
		final Business2 business = new Business2();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					business.sub(i);
				}
			}
		}).start();
		for (int i = 10; i < 20; i++) {
			System.out.println("before main");
			business.main(i);
			System.out.println("running main");
		}
	}

	public static class Business2 {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		boolean isSub = true;

		public void main(int i) {
			lock.lock();
			System.out.println(isSub);
			try {

				while (isSub) {
					try {
						condition.await();
					} catch (Exception e) {
					}
				}

				for (int j = 20; j < 30; j++) {
					System.out.println("main thread sequence of " + j
							+ "loop of" + i+"    "+Thread.currentThread().getName());
				}
				isSub = true;
				condition.signal();
			}

			finally {
				lock.unlock();
			}
		}

		public void sub(int i) {
			lock.lock();
			try {
				while (!isSub) {
					try {
						condition.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for (int j = 30; j < 40; j++) {
					System.out.println("sub thread sequence of " + j
							+ "loop of" + i+"    "+Thread.currentThread().getName());
				}
				isSub = false;
				System.out.println(isSub);
				condition.signal();
			} finally {
				lock.unlock();
			}
		}

	}

}
