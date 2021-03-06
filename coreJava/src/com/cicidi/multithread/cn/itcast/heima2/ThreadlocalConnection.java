//package com.cicidi.multithread.cn.itcast.heima2;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Random;
//
//import com.cicidi.multithread.cn.itcast.heima2.Threadlocaltest.MySharedData;
//
///* 讲这道提的原因是 比如A-B  转出，转入钱
// *                  C-D  转出，转入钱
// *                 如果假设他们使用统一个connection的话，那么在C-D 完成transaction的时候，commit A-B 
// *                 可能之进行到第一步，还没有进行第二步
// *                 所以对于每一个transction 去找对应的connection 然后commit  而不影响其他的。
// * */
//public class ThreadlocalConnection {
//
//	private static ThreadLocal<Integer> x = new ThreadLocal<Integer>();
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 2; i++) {
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					int data = new Random().nextInt();
//					System.out.println("generate value data =" + data);
//					x.set(data);
//					// threadSharedData.get().getInstace().setName("name"+data);
//					// threadSharedData.get().getInstace().setAge(data);
//					ConnectionPool.getInstace().setConnection("name" + data);
//					ConnectionPool.getInstace().setAge(data);
//
//					System.out.println(MySharedData.getInstace().getName());
//					new A().get();
//					new B().get();
//				}
//			}).start();
//		}
//	}
//
//	static class A {
//		public void get() {
//			int data = x.get();
//			MySharedData myData = MySharedData.getInstace();
//			System.out.println(Thread.currentThread().getName()
//					+ "put data value :" + "Method A" + myData.getName());
//
//		}
//	}
//
//	static class B {
//		public void get() {
//			int data = x.get();
//			MySharedData myData = MySharedData.getInstace();
//			System.out.println(Thread.currentThread().getName()
//					+ "put data value :" + "Method B" + myData.getName());
//
//		}
//	}
//
//	class Connection {
//		private int con;
//
//		public Connection(int i) {
//			this.con = i;
//		}
//
//		public int getCon() {
//			return con;
//		}
//
//		public void setCon(int con) {
//			this.con = con;
//		}
//
//	}
//
//	static class ConnectionPool {
//		private static List<Connection> connections = new LinkedList<Connection>();
//		private static ThreadLocal<Integer> threadSharedData;
//		private Connection connection;
//
//		private ConnectionPool() {
//			for (int i = 0; i < 2; i++) {
//				this.connections.add(new Connection(i));
//			}
//		}
//
//		public Connection getConnection() {
//			return connection;
//		}
//
//		public void setConnection(Connection connection) {
//			this.connection = connection;
//		}
//
//		public static ConnectionPool getInstace() {
//			ConnectionPool instance = threadSharedData.get();
//			if (instance == null) {
//				instance = new MySharedData();
//				threadSharedData.set(instance);
//			}
//			return instance;
//		}
//	}
//
// }
