package com.cicidi.multithread.ThreadConnectTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RequestBuffer {
	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();

	final Request[] items = new Request[100];
	int putptr, takeptr, count;

	public void put(Request x) throws InterruptedException {
		lock.lock();

		try {
			while (count == items.length)
				notFull.await();

			items[putptr] = x;
			if (++putptr == items.length)
				putptr = 0;
			++count;
			notEmpty.signal();

		} finally {
			lock.unlock();
		}
	}

	public Request take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				notEmpty.await();
			Request x = items[takeptr];
			if (++takeptr == items.length)
				takeptr = 0;
			--count;
			notFull.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}
