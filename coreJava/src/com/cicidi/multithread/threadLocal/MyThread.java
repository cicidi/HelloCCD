package com.cicidi.multithread.threadLocal;

public class MyThread implements Runnable {
	private String msg;

	public MyThread(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// tlMgt.getThreadLocal().set(Thread.currentThread().getName());
		// System.out.println(ThreadLocalManagement.getThreadLocal().get()
		// .toString());
		Session session = new Session();
		session.setSessionName(Thread.currentThread().getName());
		ThreadLocalManagement.getThreadLocal().set(session);
		Session sessionText = (Session) ThreadLocalManagement.getThreadLocal()
				.get();
		System.out.println("Thread name=+" + Thread.currentThread().getName()
				+ "Session Name= " + sessionText.getSessionName());
	}
}
