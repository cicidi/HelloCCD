package com.cicidi.multithread.join;

public class HelloWorld {
	public static void main(String[] arg) throws InterruptedException {
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println("Current Thead Name"
						+ Thread.currentThread().getName());
				System.out.println("Hello");

				// Thread.currentThread().getName();
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("Current Thead Name"
						+ Thread.currentThread().getName());
				System.out.println("World");

			}
		};

		Thread thread3 = new Thread() {
			public void run() {
			}
		};
		System.out.println("Current Thead Name"
				+ Thread.currentThread().getName());
		thread1.start();
		thread1.join();
		System.out.println("Current Thead Name"
				+ Thread.currentThread().getName());
		thread2.start();

	}
}