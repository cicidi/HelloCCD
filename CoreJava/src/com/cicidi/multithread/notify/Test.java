package com.cicidi.multithread.notify;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/*
	 * Question　requirement: use two thread print "Hello World" Ans 1 : use join
	 * thread1.start() thread1.join() thread2.start() thread2.join() Ans 2
	 * Sometime it is requirement to use wait() and notify() 1)in this example i
	 * create 2 type of thread() , I can use only one type, but in the run()
	 * method has to check the name of thread, or ,both thread will wait(), no
	 * one can call each other 2)Lets go back ,I create 2 type of thread, run
	 * method are diff 3)These 2 thread has to share one object, then we can use
	 * synchronized, and only the object obtain the monitor can notify wait() or
	 * it will throw InterruptedException
	 */
	/*
	 * comment 2 : since threads are sharing on object list, I can use this
	 * sample to call different calcuation but put all the result into one
	 * object
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] array = { "Hello", "World" };
		List list = new ArrayList();

		Thread thread2 = new Thread(new HelloThread(list), "Hello");
		Thread thread1 = new Thread(new WorldThread(list), "World");
		thread1.start();

		thread2.start();

	}
}
