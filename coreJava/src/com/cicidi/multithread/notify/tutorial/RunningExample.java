package com.cicidi.multithread.notify.tutorial;

import com.cicidi.multithread.notify.tutorial.HelperClass.WaitingThread;
import com.cicidi.multithread.notify.tutorial.HelperClass.WakingThread;

public class RunningExample {
	public static void main(String[] args) {
//		try {
			Thread waitThread = new WaitingThread();
			Thread wakingThread = new WakingThread();
			
			//Start the execution.
			waitThread.start();
			wakingThread.start();
			
			//Wait for all threads to terminate.
//			waitThread.join();
//			wakingThread.join();
//		}
//		catch (InterruptedException ex) {
//			System.err.println("An InterruptedException was caught: " + ex.getMessage());
//			ex.printStackTrace();
//		}
	}
}
