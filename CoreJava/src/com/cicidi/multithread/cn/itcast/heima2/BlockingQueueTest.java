package com.cicidi.multithread.cn.itcast.heima2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		final BlockingQueue queue = new ArrayBlockingQueue(3);
		for(int i=0;i<2;i++){
			new Thread(){
				public void run(){
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName() + "is ready to put data");							
							queue.put(1);
							System.out.println(Thread.currentThread().getName() + "has put data" + 							
										"queue has" + queue.size() + " data now");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				}
				
			}.start();
		}
		
		new Thread(){
			public void run(){
				while(true){
					try {
						//���˴���˯��ʱ��ֱ��Ϊ100��1000���۲����н��
						Thread.sleep(10000);
						System.out.println(Thread.currentThread().getName() + "is ready to take data");
						queue.take();
						System.out.println(Thread.currentThread().getName() + "has take data" + 							
								"queue has" + queue.size() + "data now");					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();			
	}
}
