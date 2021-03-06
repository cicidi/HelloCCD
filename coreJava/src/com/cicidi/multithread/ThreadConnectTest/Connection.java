package com.cicidi.multithread.ThreadConnectTest;

import org.apache.log4j.Logger;

public class Connection {
	static Logger log = Logger.getLogger(Connection.class.getName());
	private Request re;
	private int connectNO;
	private boolean available = true;

	public Connection(int i) {
		this.setConnectNO(i);
		// TODO Auto-generated constructor stub
	}

	public Request getRe() {
		return re;
	}

	public void setCon(Request re) {
		this.re= re;
	}

	public boolean isAvailable() {
		return available;

	}

	public void setAvailable(boolean available) {
		this.available = available;
		log.info(Thread.currentThread().getName()+" Set connection No "+this.connectNO+available);
	}

	public int getConnectNO() {
		return connectNO;
	}

	public void setConnectNO(int connectNO) {
		this.connectNO = connectNO;
	}

}
