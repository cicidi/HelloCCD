package com.cicidi.multithread.ThreadConnectTest;

import java.util.LinkedList;
import java.util.List;
import java.util.TimerTask;

public class MyTimertask2 extends TimerTask {

	@Override
	public void run() {
		List<Request> relist = new LinkedList<Request>();
		relist = MyTimertask.getRequestList();
		System.out.println("MyTimertask2 the request list size is \t"+relist.size());
		System.out.println("MyTimertask2 the request list size is \t"+relist.get(relist.size()-1).getData());
	}

}
