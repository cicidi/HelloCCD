package com.cicidi.jaxb.model.interprator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cicidi.jaxb.model.AbstractBookmark;
import com.cicidi.jaxb.model.Bookmark;
import com.cicidi.jaxb.model.Bookmarks;

public class XmlReader<T> {
	public static Bookmarks read(String fileName) {

		Bookmarks instance = null;

		try {

			File file = new File("resources/" + fileName + ".xml");
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
			file = new File("resources/" + target + ".xml");
		}
		if (target == "bookmark") {
			jaxbUnmarshaller = ModelJAXBContext.initContext()
					.createUnmarshaller();
			ref = (Bookmark) jaxbUnmarshaller.unmarshal(file);
		}
		if (target == "bookmarks") {
			jaxbUnmarshaller = ModelJAXBContext.initContext()
					.createUnmarshaller();
			ref = (Bookmarks) jaxbUnmarshaller.unmarshal(file);
		}

		return ref;
	}

	public static void main(String[] args) {
		try {
			String fileName = "Bookmarks";
			File file = new File("resources/" + fileName + ".xml");
			JAXBContext jaxbContext = null;
			// jaxbContext = JAXBContext.newInstance(Class
			// .forName("com.cicidi.rest.model." + fileName));
			jaxbContext = ModelJAXBContext.initContext();

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Bookmarks instance = (Bookmarks) jaxbUnmarshaller.unmarshal(file);
			System.out.println(instance);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
