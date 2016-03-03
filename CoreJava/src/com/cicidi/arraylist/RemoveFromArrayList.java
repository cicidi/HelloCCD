package com.cicidi.arraylist;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 这个例子想说明并不是每一次都会有　ConcurrentModificationException
 * This exmaple shows not every time you can get a ConcurrentModificationException
 * Exception in thread "main" java.util.ConcurrentModificationException
 at java.util.AbstractList$Itr.checkForComodification(AbstractList.java:372)
 at java.util.AbstractList$Itr.next(AbstractList.java:343)
 at com.cicidi.arraylist.RemoveFromArrayList.main(RemoveFromArrayList.java:60)
 */
public class RemoveFromArrayList {
	ArrayList<String> newlist = new ArrayList<String>();

	public static void main(String[] args) {
		final CopyOnWriteArrayList<String> newlist = new CopyOnWriteArrayList<String>();
		newlist.add("a");
		newlist.add("b");
		newlist.add("c");
		newlist.add("e");
		newlist.add("d");
		// CopyOnWriteArrayList<String> cplist = new
		// CopyOnWriteArrayList<String>();
		// cplist.add("1");
		// cplist.add("2");
		// cplist.add("3");
		// cplist.add("4");
		// cplist.add("5");
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < newlist.size(); i++) {
					if (newlist.get(i).equals("b")) {
						newlist.remove("b");
					}
				}

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < newlist.size(); i++) {
					if (newlist.get(i).equals("c")) {
						newlist.remove("c");
					}
				}

			}
		});
		thread2.start();
		thread1.start();
		// for (int i = 0; i < newlist.size(); i++) {
		// if (newlist.get(i).equals("b")) {
		// newlist.remove("e");
		// }
		// }
		// for (String str : cplist) {
		// if (str.equals("2")) {
		// cplist.remove(str);
		// }
		// }
		for (String str : newlist) {
			System.out.println(str);
		}
		// for (String str : cplist) {
		// System.out.println(str);
		// }
	}
}
