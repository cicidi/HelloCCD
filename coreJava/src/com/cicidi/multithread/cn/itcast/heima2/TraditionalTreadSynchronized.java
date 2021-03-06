package com.cicidi.multithread.cn.itcast.heima2;

public class TraditionalTreadSynchronized {

	public static void main(String[] args) {
		TraditionalTreadSynchronized trade = new TraditionalTreadSynchronized();
		trade.init();
	}

	private void init() {
		final Outputer outputer = new Outputer();
		/*
		 * No enclosing instance of type TraditionalTreadSynchronized is
		 * accessible. Must qualify the allocation with an enclosing instance of
		 * type TraditionalTreadSynchronized (e.g. x.new A() where x is an
		 * instance of TraditionalTreadSynchronized).
		 */
		// 在静态方法中不能初始化内部类的实例对象， 原因是main 方法不需要初始化一个实例，如果main 方法没有初始化，
		// 那么久不会给里面的Outputer 分配内存 所以把这段代码加到init（） 里面去
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					outputer.out("cicidi");
				}
			}

		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					outputer.out("spring");
				}
			}

		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Outputer.out2("Ajax");
				}
			}

		}).start();
	}

	public static class Outputer {
		public void out(String name) {
			int len = name.length();
			synchronized(Outputer.class){// synchronized 保护是out 这个方法   或者可以給這個class 加上synchronized
				//如果這兩個synchronized 都存在的話，那麼會出現死鎖的問題
				for (int i = 0; i < len; i++) {
					System.out.print(name.charAt(i));
				}
				System.out.println("");
			}
		}
		public static void out2(String name) {
			int len = name.length();
			synchronized(Outputer.class){/* 我重新複製copy 了out 方法，然後創建了一個static 方法，
				這裏值得注意的是，首先 static 方法也可以實例化，但是在裏面synchronized 的時候就不能用this 了，
				而是要把class 名字加進去。
				第二點 實例化的outper 和Class 的static 他們用的不是一個鎖，所以會出現線程錯誤
				*/
				for (int i = 0; i < len; i++) {
					System.out.print(name.charAt(i));
				}
				System.out.println("");
			}
		}
	}
	
}
