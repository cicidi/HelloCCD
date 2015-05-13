package com.cicidi.multithread.cn.itcast.heima2;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final Exchanger exchanger = new Exchanger();
		service.execute(new Runnable(){
			public void run() {
				try {				

					String data1 = "zxx";
					System.out.println("Thread" + Thread.currentThread().getName() + 
					"is getting" + data1 +"off");
					Thread.sleep((long)(Math.random()*10000));
					String data2 = (String)exchanger.exchange(data1);
					System.out.println("Thread" + Thread.currentThread().getName() + 
					"has get a exchange of" + data2);
				}catch(Exception e){
					
				}
			}	
		});
		service.execute(new Runnable(){
			public void run() {
				try {				

					String data1 = "lhm";
					System.out.println("Thread" + Thread.currentThread().getName() + 
					"is getting" + data1 +"off");
					Thread.sleep((long)(Math.random()*10000));					
					String data2 = (String)exchanger.exchange(data1);
					System.out.println("Thread" + Thread.currentThread().getName() + 
					"has get a exchange of" + data2);
				}catch(Exception e){
					
				}				
			}	
		});		
	}
}
