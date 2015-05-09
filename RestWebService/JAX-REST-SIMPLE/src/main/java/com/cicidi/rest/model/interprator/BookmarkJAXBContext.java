package com.cicidi.rest.model.interprator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.cicidi.rest.model.Bookmark;

public class BookmarkJAXBContext {
	private static JAXBContext instance;

	// 这里instance　和创建instance　的方法都弄成static的
	public BookmarkJAXBContext() {
	}

	public static JAXBContext initContext() {
		if (instance == null) {
			synchronized (BookmarkListJAXBContext.class) {
				if (instance == null) {
					try {
						instance = JAXBContext.newInstance(Bookmark.class);
					} catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return instance;
	}
}
