package com.cicidi.multithread.cn.itcast.heima2;

public class TraditionalThreadCommunication {

	public static void main(String[] args) {

		final Business business = new Business();

		new Thread(new Runnable() {

			@Override	
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 1; i <= 50; i++) {
					business.sub(i);
				}
			}
		}).start();

		for (int i = 1; i <= 50; i++) {
			business.main(i);
		}
	}
}

class Business {
	boolean isSub = true;

	public synchronized void sub(int i) {
		while (isSub) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("sub sequence of" + j + "loop of " + i);
			}
			isSub=false;
			this.notify();
		}
		while(!isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public synchronized void main(int i) {
		while (isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		for (int j = 1; j <= 20; j++) {
			System.out.println("main sequence of" + j + "loop of " + i);
		}
		isSub=true;
		this.notify();
	}
}
