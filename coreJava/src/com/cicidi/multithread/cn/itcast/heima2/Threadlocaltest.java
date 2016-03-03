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
public class Threadlocaltest {
	
	private static ThreadLocal<Integer> x= new ThreadLocal<Integer>();
	private static ThreadLocal<MySharedData> threadSharedData= new ThreadLocal<MySharedData>();

	public static void main (String[] args){
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					int data = new Random().nextInt();
					System.out.println("generate value data =" + data);
					x.set(data);
					//threadSharedData.get().getInstace().setName("name"+data);
					//threadSharedData.get().getInstace().setAge(data);
					MySharedData.getInstace().setName("name"+data);
					MySharedData.getInstace().setAge(data);
				
					System.out.println(MySharedData.getInstace().getName());
					new A().get();
					new B().get();
				}
			}).start();
		}
	}
	

	static class A {
		public void get() {
			int data=x.get();
			System.out.println("A from " + Thread.currentThread().getName() 
					+ " get data :" + data);
			MySharedData myData=MySharedData.getInstace();
			System.out.println("A from " + Thread.currentThread().getName() 
					+ " getMyData: " + myData.getName() + "," +
					myData.getAge());
		}
	}

	static class B {
		public void get() {
			int data=x.get();
			System.out.println("B from " + Thread.currentThread().getName() 
					+ " get data :" + data);
			MySharedData myData=MySharedData.getInstace();
			System.out.println("B from " + Thread.currentThread().getName() 
					+ " getMyData: " + myData.getName() + "," +
					myData.getAge());
		}
	}
	
	static class MySharedData{
		private String name;
		public int getAge() {
			return age;
		}
		public void setAge(int data) {
			this.age = data;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private int age;
	
		private MySharedData(){		
		}
		public static MySharedData getInstace(){
			MySharedData instance=threadSharedData.get();
			if (instance==null){
				instance= new MySharedData();
				threadSharedData.set(instance);
			}
			return instance;
		}
	}

}
