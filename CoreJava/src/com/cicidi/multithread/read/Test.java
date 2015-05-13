package com.cicidi.multithread.read;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

	public static void main(String[] args) {
		final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						try {
							String log = queue.take();
							parseLog(log);
							// System.out.println(Thread.currentThread().getName());
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}).start();
		}

		System.out.println("begin:" + (System.currentTimeMillis() / 1000));

		for (int i = 0; i < 16; i++) {
			final String log = "" + (i + 1);
			{
				try {
					queue.put(log);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Test.parseLog(log);
			}
		}
	}

	// ���д��벻�ܸĶ�

	public static void parseLog(String log) {
		System.out.println(log + ":" + (System.currentTimeMillis() / 1000));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
