package com.cicidi.multithread.ThreadConnectTest;

import java.util.Random;

public class Request {
	private int data;

	public Request() {
		this.data = new Random().nextInt(10000) + 10000;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
