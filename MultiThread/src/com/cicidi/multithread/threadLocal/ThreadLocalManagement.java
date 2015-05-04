package com.cicidi.multithread.threadLocal;

public class ThreadLocalManagement {
// 这里之所以用final　static　就是因为　ThreadLocal　本身一个就够了，　至于每个thread　匹配的那个　threadlocal　value　是通过currentThread
	//作为key　　threadlocal value 作为map的value　　　如果这个value　用完了可以call　threadlocal　的remove　方法　去掉
	private final static ThreadLocal threadLocal = new ThreadLocal();

	public static ThreadLocal getThreadLocal() {
		return threadLocal;
	}

}
