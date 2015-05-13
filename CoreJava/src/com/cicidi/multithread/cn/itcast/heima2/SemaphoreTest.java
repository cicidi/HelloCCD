package com.cicidi.multithread.cn.itcast.heima2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final  Semaphore sp = new Semaphore(3);
		for(int i=0;i<10;i++){
			Runnable runnable = new Runnable(){
					public void run(){
					try {
						sp.acquire();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println("thread" + Thread.currentThread().getName() + 
							"get in, currently have" + (3-sp.availablePermits()) + "thread concurrent");
					try {
						Thread.sleep((long)(Math.random()*10000));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("tread" + Thread.currentThread().getName() + 
							"is leaving");					
					sp.release();
					
					System.out.println("thread" + Thread.currentThread().getName() + 
							"has left, currently have" + (3-sp.availablePermits()) + "thread concurrent");					
				}
			};
			service.execute(runnable);			
		}
	}

}
