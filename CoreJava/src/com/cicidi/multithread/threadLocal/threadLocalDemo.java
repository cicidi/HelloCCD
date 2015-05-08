package com.cicidi.multithread.threadLocal;

public class threadLocalDemo {

	public static void main(String[] arg) {
		Thread thread1 = new Thread(new MyThread("Thread X"));
		Thread thread2 = new Thread(new MyThread("Thread Y"));
		thread1.start();
		thread2.start();
	}
}
