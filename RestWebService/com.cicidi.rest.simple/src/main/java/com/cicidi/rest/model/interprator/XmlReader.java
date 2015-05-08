package com.cicidi.rest.model.interprator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cicidi.rest.model.AbstractBookmark;
import com.cicidi.rest.model.Bookmark;
import com.cicidi.rest.model.Bookmarks;

public class XmlReader {
	public static Bookmarks read(String fileName) {

		Bookmarks instance = null;

		try {

			File file = new File("src/main/resources/" + fileName + ".xml");
			JAXBContext jaxbContext = null;
			try {
				jaxbContext = JAXBContext.newInstance(Class
						.forName("com.cicidi.rest.model." + fileName));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			instance = (Bookmarks) jaxbUnmarshaller.unmarshal(file);
			System.out.println(instance);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return instance;
	}

	public static AbstractBookmark unmarshall(String target, String path)
			throws JAXBException {

		AbstractBookmark ref = null;
		File xmlFile = null;
		Unmarshaller jaxbUnmarshaller = null;
		File file;
		if (path != null) {
			file = new File(path + "/" + target + ".xml");
		} else {
			file = new File("src/main/resources/" + target + ".xml");
		}
		if (target == "bookmark") {
			jaxbUnmarshaller = BookmarkJAXBContext.initContext()
					.createUnmarshaller();
			ref = (Bookmark) jaxbUnmarshaller.unmarshal(file);
		}
		if (target == "bookmarks") {
			jaxbUnmarshaller = BookmarkListJAXBContext.initContext()
					.createUnmarshaller();
			ref = (Bookmarks) jaxbUnmarshaller.unmarshal(file);
		}

		return ref;
	}

	public static void main(String[] args) {
		try {
			String fileName = "Bookmarks";
			File file = new File("src/main/resources/" + fileName + ".xml");
			JAXBContext jaxbContext = null;
			// jaxbContext = JAXBContext.newInstance(Class
			// .forName("com.cicidi.rest.model." + fileName));
			jaxbContext = JAXBContext
					.newInstance(com.cicidi.rest.model.Bookmark.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Bookmark instance = (Bookmark) jaxbUnmarshaller.unmarshal(file);
			System.out.println(instance);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
