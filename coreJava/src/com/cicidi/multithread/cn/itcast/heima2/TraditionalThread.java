package com.cicidi.multithread.cn.itcast.heima2;

import java.util.Date;
import java.util.Timer;


import java.util.TimerTask;

public class TraditionalThread {
	public static int m=0;    //这个m 只能放在这个地方，因为 static 的attribute 不能定义在非static inner class 
	                            //里面也就是MytimeTask 里面
	public static void main(String[] arg) {
			
		class MyTimerTask extends TimerTask {
				
			@Override
			public void run() {
				 m=(m+1)%2;
				System.out.println("Boring");
				new Timer().schedule(new MyTimerTask(), 2000+2000*m);
			}
		}
		new Timer().schedule(new MyTimerTask(), 2000);// 如果把这句话放在while loop的后面，因为它永远不会被执行，所以会报错，remove
		while (true) {
			System.out.println(new Date().getSeconds());
			try {
				Thread.sleep(1000);
				//System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) { // TODO Auto-generated catch
												// block
				e.printStackTrace();
			}
		}
		
	}
}