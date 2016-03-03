package com.cicidi.multithread.ThreadConnectTest;

import java.util.Date;
import java.util.Iterator;
import java.util.Timer;

import org.apache.log4j.Logger;

import com.cicidi.multithread.ThreadConnectTest.ConnectionPool.A;
import com.cicidi.multithread.ThreadConnectTest.ConnectionPool.B;

public class RequestServlet {
	static Logger log = Logger.getLogger(RequestServlet.class.getName());

	public static void main(String arg[]) {
		Logger log = Logger.getLogger(RequestServlet.class.getName());
		new Timer().schedule(new MyTimertask(), 0);
		new Timer().schedule(new MyTimertask2(), 10000);
		RequestBuffer rb = new RequestBuffer();

		while (true) {
			Iterator<Request> it = MyTimertask.getRequestList().iterator();
			while (it.hasNext()) {
				try {
					Request re = new Request();
					rb.put(re);
					System.out.println("The data put to buffer is \t"
							+ it.next().getData());
					VO.getVOinstance().getConnectionPool().setUpConnection();
					VO.getVOinstance().getConnection().setCon(rb.take());
					for (int i=0;i<MyTimertask.getRequestList().size();i++){
						System.out.print("The values of Object"+i+"is");
						System.out.println(MyTimertask.getRequestList().get(i).getData()+" ");
					}
					new A().get();
					new B().get();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("time now" + new Date().getSeconds());
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
