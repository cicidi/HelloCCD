package com.cicidi.multithread.ThreadConnectTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class MyTimertask extends TimerTask {
	static Logger log = Logger.getLogger(MyTimertask.class.getName());
	private static List<Request> requestList = new LinkedList<Request>();
	private static MyTimertask instance;
	
	public static List<Request> getRequestList() {
		return requestList;
	}
	public static void setRequestList(List<Request> requestList) {
		MyTimertask.requestList = requestList;
	}
	public static MyTimertask getInstance() {
		if (instance == null)
			instance = new MyTimertask();
		return instance;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Request request = new Request();
		int count = new Random().nextInt(12) + 6;
		requestList.add(request);
		log.info("The gernated data is\t" + request.getData());
		new Timer().schedule(new MyTimertask(), 1000);
		log.info("The request size is\t" + requestList.size());
	};

}
