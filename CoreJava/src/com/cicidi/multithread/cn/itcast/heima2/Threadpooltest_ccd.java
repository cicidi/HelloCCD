package com.cicidi.multithread.cn.itcast.heima2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpooltest_ccd {
	public static void main(String arg[]) {
		//ExecutorService threadPool = Executors.newFixedThreadPool(3);
		ExecutorService threadPool = Executors.newCachedThreadPool();

		for (int j = 1; j <= 10; j++) {
			final int task = j;
			threadPool.execute(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (int i = 0; i < 10; i++) {
						System.out.println(Thread.currentThread().getName()
								+ "is loop of " + i + "task of " + task);
					}

				}

			});
		}
		System.out.println("All of 10 tasks have committed! ");
		threadPool.shutdown();
		//		threadPool.shutdown();// 前三个task 干完就shut down了
	

	}

}
