package com.cicidi.jaxb.model.interprator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class ModelJAXBContext {
	private static JAXBContext instance;

	// 这里instance　和创建instance　的方法都弄成static的
	public ModelJAXBContext() {
	}

	public static JAXBContext initContext() {
		if (instance == null) {
			synchronized (JAXBContext.class) {
				if (instance == null) {
					try {
						instance = JAXBContext.newInstance(
								com.cicidi.jaxb.model.Bookmark.class,
								com.cicidi.jaxb.model.BookmarkRef.class,
								com.cicidi.jaxb.model.Bookmarks.class);
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
