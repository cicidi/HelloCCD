package com.cicidi.singleton;

public class SingletonTest {
	private static Student instance;

	public static Student getSingletonInstance() throws InterruptedException {
		if (instance == null)
			synchronized (SingletonTest.class) {
				if (instance == null) {

					instance = new Student(Thread.currentThread().getName(),
							29, "CA");
					System.out.println(Thread.currentThread().getName()
							+ "is Creating"
							+ SingletonTest.getSingletonInstance()
							+ "-----------------");
				}
			}
		System.out.println(Thread.currentThread().getName()
				+ "will return instance --" + instance.getName());
		return instance;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName()
							+ " is init");
					try {
						SingletonTest.getSingletonInstance();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			;
		}
	}
}
