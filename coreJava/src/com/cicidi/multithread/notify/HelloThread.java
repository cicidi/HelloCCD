package com.cicidi.multithread.notify;

import java.util.List;

public class HelloThread implements Runnable {
	List list;

	public HelloThread(List list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	public void run() {

		synchronized (list) {

			while (list.size() == 0) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.print("Thread name" + Thread.currentThread().getName());
			System.out.println("World!");
		}
	}
}