package com.cicidi.multithread.ThreadConnectTest;

public class VO {
	private Connection connection;
	private int data;
	private ConnectionPool connectionPool;
	private static ThreadLocal<VO> myVo= new ThreadLocal<VO>();
	
	public static ConnectionPool getConnectionPool() {
		return ConnectionPool.getConnectionPool();
	}

	public void setConnectionPool(ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}

	private VO() {
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static VO getVOinstance() {
		VO instance= myVo.get();
		if (instance == null) {
			instance = new VO();
		}
		myVo.set(instance);
		return instance;
	}

}
