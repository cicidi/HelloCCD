package com.cicidi.multithread.semaphmore;

import java.util.concurrent.Semaphore;

public class MainClass {

	static Semaphore hello = new Semaphore(1);
	static Semaphore world = new Semaphore(0);

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.hello = hello;
		mt.world = world;
		mt.start();

		for (int i = 0; i < 5; i++) {
			hello.acquire(); // wait for it
			System.out.println(Thread.currentThread().getName() + " Hello");

			world.release(); // go say world
		}
	}
}

class MyThread extends Thread {

	Semaphore hello, world;

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				world.acquire(); // wait-for it
				System.out.println(Thread.currentThread().getName()
						+ "   World!");

				hello.release(); // go say hello
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}