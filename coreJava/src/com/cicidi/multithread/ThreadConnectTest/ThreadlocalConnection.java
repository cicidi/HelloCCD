package com.cicidi.multithread.ThreadConnectTest;

import java.util.Random;

import com.cicidi.multithread.ThreadConnectTest.ConnectionPool.A;
import com.cicidi.multithread.ThreadConnectTest.ConnectionPool.B;

/* 讲这道提的原因是 比如A-B  转出，转入钱
 *                  C-D  转出，转入钱
 *                 如果假设他们使用统一个connection的话，那么在C-D 完成transaction的时候，commit A-B 
 *                 可能之进行到第一步，还没有进行第二步
 *                 所以对于每一个transction 去找对应的connection 然后commit  而不影响其他的。
 * */
public class ThreadlocalConnection {

	private static ThreadLocal<Integer> x = new ThreadLocal<Integer>();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					int data = new Random().nextInt();
					System.out.println(Thread.currentThread().getName()
							+ " generate value data =" + data);
					// threadSharedData.get().getInstace().setName("name"+data);
					// threadSharedData.get().getInstace().setAge(data);
					// ConnethreadSharedData.get().getInstace().setName("name"+data);
					// threadSharedData.get().getInstace().setAge(data);
					// ConnectionPool.setConnection("name" + data);
					// ConnectionPool.getInstace().setAge(data)ctionPool.setConnection("name"
					// + data);
					// ConnectionPool.getInstace().setAge(data);
					VO.getVOinstance().getConnectionPool().setUpConnection();
					// VO.getVOinstance().getConnection().setCon(data);
					new A().get();
					new B().get();
					// ConnectionPool.getConnection().setAvailable(true);
				}
			}).start();
		}

	}
}
