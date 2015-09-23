package com.cicidi.multithread.cn.itcast.heima2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* 讲这道提的原因是 比如A-B  转出，转入钱
 *                  C-D  转出，转入钱
 *                 如果假设他们使用统一个connection的话，那么在C-D 完成transaction的时候，commit A-B 
 *                 可能之进行到第一步，还没有进行第二步
 *                 所以对于每一个transction 去找对应的connection 然后commit  而不影响其他的。
 * */
public class ThreadScopedSharedData {
	
	private static Map<Thread,Integer> threadData=new HashMap<Thread,Integer>();
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					int data = new Random().nextInt();
					System.out.println("generate value data =" + data);
					threadData.put(Thread.currentThread(), data);
					new A().get();
					new B().get();
				}
			}).start();
		}
	}


	static class A {
		public void get() {
			int data=threadData.get(Thread.currentThread());
			System.out.println(Thread.currentThread().getName()
					+ "put data value :" + "Method A" + data);

		}
	}

	static class B {
		public void get() {
			int data=threadData.get(Thread.currentThread());
			System.out.println(Thread.currentThread().getName()
					+ "put data value :" + "Method B" + data);

		}
	}

}
