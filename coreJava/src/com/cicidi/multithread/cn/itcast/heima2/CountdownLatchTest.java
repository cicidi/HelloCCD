package com.cicidi.multithread.cn.itcast.heima2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final CountDownLatch cdOrder = new CountDownLatch(1);
		final CountDownLatch cdAnswer = new CountDownLatch(3);		
		for(int i=0;i<3;i++){
			Runnable runnable = new Runnable(){
					public void run(){
					try {
						System.out.println("Thread" + Thread.currentThread().getName() + 
								"ready to receive command");						
						cdOrder.await();
						System.out.println("Thread" + Thread.currentThread().getName() + 
						"have received command");								
						Thread.sleep((long)(Math.random()*10000));	
						System.out.println("Thread" + Thread.currentThread().getName() + 
								"response to the command");						
						cdAnswer.countDown();						
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}
			};
			service.execute(runnable);
		}		
		try {
			Thread.sleep((long)(Math.random()*10000));
		
			System.out.println("Thread" + Thread.currentThread().getName() + 
					"will send commnad");						
			cdOrder.countDown();
			System.out.println("Thread" + Thread.currentThread().getName() + 
			"have sned command waiting for result");	
			cdAnswer.await();
			System.out.println("Thread" + Thread.currentThread().getName() + 
			"received all the command");	
		} catch (Exception e) {
			e.printStackTrace();
		}				
		service.shutdown();

	}
}
