package com.cicidi.singleton;

public class SingletonClass {

	public static void main(String[] arg) {
		(new SingletonClass()).getMethod();
	}

	StaticClass sc = new StaticClass();
	StaticClass sc2 = new StaticClass();

	public void getMethod() {
		sc.get();
		sc2.get();
		StaticClass.hello();
		StaticClass.hello();
	}

	public static class StaticClass implements IStatic {
		static int count = 0;
		int instanceCount = 0;

		public static void hello() {
			count++;
			System.out.println("Hello :" + count);
		}
//
//		public static void gets() {
//			// TODO Auto-generated method stub
//
//			System.out.println("get :" + instanceCount);
//			instanceCount++;
//		}

		@Override
		public void get() {
			// TODO Auto-generated method stub

		}

	}
}
