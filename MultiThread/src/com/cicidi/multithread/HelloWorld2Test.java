package com.cicidi.multithread;

public class HelloWorld2Test {

	/**
	 * @param args
	 * @throws InterruptedException
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
			thread2.join();
		}
		// (new Thread(new HelloWorld2("Hello"))).start();
		// thread2.start();
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