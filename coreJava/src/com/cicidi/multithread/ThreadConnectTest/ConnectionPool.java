package com.cicidi.multithread.ThreadConnectTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConnectionPool {
	private List<Connection> connections = new LinkedList<Connection>();
	private static ConnectionPool connectionPoolinstance;
	private static ThreadLocal<VO> threadSharedData = new ThreadLocal<VO>();
	private static int cont = 0;

	public List<Connection> getConnections() {
		return connections;
	}

	public synchronized void setConnections(List<Connection> connections) {
		this.connections = connections;
	}

	private ConnectionPool() {
		for (int i = 0; i < 2; i++) {
			this.connections.add(new Connection(i));
		}
	}

	public static ConnectionPool getConnectionPool() {
		if (connectionPoolinstance == null) {
			connectionPoolinstance = new ConnectionPool();
		}
		return connectionPoolinstance;
	}

	public synchronized Connection setUpConnection() throws NullPointerException {
		VO valueObject = VO.getVOinstance();
		// Connection instance = null;
		Connection connectionInstance = null;
			if (valueObject.getConnection() == null)
				;
			List<Connection> connections = ConnectionPool.getConnectionPool()
					.getConnections();
			connectionInstance = connections.get(cont % 2);
			cont = cont + 1;
			connectionInstance.setAvailable(false);
			valueObject.setConnection(connectionInstance);
			threadSharedData.set(valueObject);
			
			/*
			 * Iterator<Connection> lt = ConnectionPool.getConnectionPool()
			 * .getConnections().iterator(); while (lt.hasNext()) {
			 * connectionInstance = (Connection) lt.next();//
			 * System.out.print("classname is"+instance.getClass()+"!"); if
			 * (connectionInstance.isAvailable() == true) {
			 * threadSharedData.set(connectionInstance);
			 * System.out.println(connectionInstance.getConnectNO() + "cicidi");
			 * connectionInstance.setAvailable(false); break; }
			 * 
			 * else if (connectionInstance.isAvailable() == false) { if
			 * (threadSharedData.get() == null) {
			 * System.out.println(Thread.currentThread
			 * ().getName()+"'s Connection is null"); } else
			 * System.out.println(Thread.currentThread().getName() +
			 * "Got error on" + threadSharedData.get().getConnectNO());
			 * 
			 * }con
			 * 
			 * }
			 */
		
		return connectionInstance;
	}

	static class A {
		public void get() {

			// System.out.println("A from " + Thread.currentThread().getName()
			// + " get data :" + data);
			VO valueObject = VO.getVOinstance();
			if (valueObject != null) {
				Connection connectionInstance = valueObject.getConnection();
				if (connectionInstance == null) {
					System.out.print("MyConnection is null");
				} else
					System.out.println("A from "
							+ Thread.currentThread().getName() + " getMyData: "
							+ connectionInstance.getRe().getData()
							+ Thread.currentThread().getName()
							+ "is using Port "
							+ connectionInstance.getConnectNO());
			}
			else{System.out.println("I got null error");}
		}
	}

	static class B {
		public void get() {

			// System.out.println("B from " + Thread.currentThread().getName()
			// + " get data :" + data);
			VO valueObject = VO.getVOinstance();
			Connection connectionInstance = valueObject.getConnection();
			if (connectionInstance == null) {
				System.out.print("MyConnection is null");
			} else
				System.out.println("B from " + Thread.currentThread().getName()
						+ " getMyData: " + connectionInstance.getRe().getData()
						+ Thread.currentThread().getName() + "is using Port "
						+ connectionInstance.getConnectNO());

		}
	}
}
