package com.cicidi.multithread.cn.itcast.heima2;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final  CyclicBarrier cb = new CyclicBarrier(3);
		for(int i=0;i<3;i++){
			Runnable runnable = new Runnable(){
					public void run(){
					try {
						Thread.sleep((long)(Math.random()*10000));	
						System.out.println("Thread!" + Thread.currentThread().getName() + 
								"will arrive point 1 " + (cb.getNumberWaiting()+1) + "thread right now" + (cb.getNumberWaiting()==2?"lets go":"keep waiting"));						
						cb.await();
						
						Thread.sleep((long)(Math.random()*10000));	
						System.out.println("Thread!" + Thread.currentThread().getName() + 
								"will arrive point 2 " + (cb.getNumberWaiting()+1) + "thread right now" + (cb.getNumberWaiting()==2?"lets go":"keep waiting"));
						cb.await();	
						Thread.sleep((long)(Math.random()*10000));	
						System.out.println("Thread!" + Thread.currentThread().getName() + 
								"will arrive point 3 " + (cb.getNumberWaiting() + 1) + "thread right now" + (cb.getNumberWaiting()==2?"lets go":"keep waiting"));						
						cb.await();						
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}
			};
			service.execute(runnable);
		}
		service.shutdown();
	}
}
