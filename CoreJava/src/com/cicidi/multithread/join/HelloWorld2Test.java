package com.cicidi.multithread.join;

public class HelloWorld2Test extends Thread {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/*
	 * You must understand , threads scheduling is controlled by thread
	 * scheduler.So, you cannot guarantee the order of execution of threads
	 * under normal circumstances.
	 * 
	 * 
	 * However if you use join() ,it makes sure that as soon as a thread calls
	 * join,the current thread(yes,currently running thread) will not execute
	 * unless the thread you have called join is finished.
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			Thread thread1 = new Thread(new HelloWorld2("H" + i));
			Thread thread2 = new Thread(new HelloWorld2("elloWorld" + i));
			thread1.start();
			// try {
			thread1.join();
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			thread2.start();
			// thread2.join();

		}
		// (new Thread(new HelloWorld2("Hello"))).start();
		// thread2.start();sss
	}

	// 这里的Override　和其他的code　没关系，我就是用来看看getName() method 的
	@Override
	public void run() {
		getName();
	}
}
// ----------------------------------------------------------
// class RunnableDemo implements Runnable {
// private Thread t;
// private String threadName;
//
// RunnableDemo(String name) {
// threadName = name;
// System.out.println("Creating " + threadName);
// }
//
// @Override
// public void run() {
// System.out.println("Running " + threadName);
// try {
// for (int i = 4; i > 0; i--) {
// System.out.println("Thread: " + threadName + ", " + i);
// // Let the thread sleep for a while.
// Thread.sleep(50);
// }
// } catch (InterruptedException e) {
// System.out.println("Thread " + threadName + " interrupted.");
// }
// System.out.println("Thread " + threadName + " exiting.");
// }
//
// public void start() {
// System.out.println("Starting " + threadName);
// (new Thread(this)).start();
// // t.start();
// }
// }
//
// public class TestThread {
// public static void main(String args[]) {
//
// RunnableDemo R1 = new RunnableDemo("Thread-1");
// R1.start();
//
// RunnableDemo R2 = new RunnableDemo("Thread-2");
// R2.start();
// }
// }