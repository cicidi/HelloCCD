package com.cicidi.ssh.model.jaxbInterprator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.cicidi.ssh.model.Bookmark;
import com.cicidi.ssh.model.BookmarkRef;
import com.cicidi.ssh.model.Bookmarks;
import com.cicidi.ssh.model.Wrapper;

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
						instance = JAXBContext.newInstance(Wrapper.class,
								Bookmark.class,
								// BookmarkRef.class,
								Bookmarks.class);
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
