package com.cicidi.multithread.notify;

import java.util.List;

public class WorldThread implements Runnable {
	List list;

	public WorldThread(List list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		// ThreadLocalMgt.set(msg);
		synchronized (list) {

			if (list.size() == 0)
				System.out.println("Thread name =  "
						+ Thread.currentThread().getName() + "  " + "Hello!");
			list.add("Hello");
			list.notify();
			;

		}
	}

}
