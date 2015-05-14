package com.cicidi.ssh.model.jaxbInterprator;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.cicidi.ssh.model.Bookmark;
import com.cicidi.ssh.model.BookmarkRef;
import com.cicidi.ssh.model.Bookmarks;
import com.cicidi.ssh.model.Wrapper;

public class XmlReader<T> {

	@SuppressWarnings("unchecked")
	private static <T> List<T> unmarshal(Unmarshaller unmarshaller,
			Class<T> clazz, String xmlLocation) throws JAXBException {
		StreamSource xml = new StreamSource(xmlLocation);
		Wrapper<T> wrapper = (Wrapper<T>) unmarshaller.unmarshal(xml,
				Wrapper.class).getValue();
		return wrapper.getItems();
	}

	private static Object unmarshal(Unmarshaller unmarshaller, File file)
			throws JAXBException {
		// StreamSource xml = new StreamSource(xmlLocation);
		Object obj = unmarshaller.unmarshal(file);
		return obj;
	}

	private static Object unmarshal(Unmarshaller unmarshaller,
			String xmlLocation) throws JAXBException {
		StreamSource xml = new StreamSource(xmlLocation);
		Object obj = unmarshaller.unmarshal(xml);
		return obj;
	}

	// load sample data;
	public static void load() {
		File sourceDir = new File("src/main/resources/xml/");
		File[] files = sourceDir.listFiles();
		for (File file : files) {
			JAXBContext jaxbContext = null;
			jaxbContext = ModelJAXBContext.initContext();
			Unmarshaller jaxbUnmarshaller;
			try {
				jaxbUnmarshaller = jaxbContext.createUnmarshaller();

				Bookmark bookmark_2 = (Bookmark) unmarshal(jaxbUnmarshaller,
						file);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			String fileName = "bookmarkInstance";
			String fileName_list = "bookmarks";
			String location = "src/main/resources/xml/" + fileName + ".xml";
			String location_list = "src/main/resources/xml/" + fileName_list
					+ ".xml";
			JAXBContext jaxbContext = null;
			jaxbContext = ModelJAXBContext.initContext();
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			List<Bookmarks> bookmarks = (List<Bookmarks>) unmarshal(
					jaxbUnmarshaller, Bookmarks.class, location_list);
			System.out.println(bookmarks);
			List<BookmarkRef> bookmark = (List<BookmarkRef>) unmarshal(
					jaxbUnmarshaller, BookmarkRef.class, location);
			System.out.println(bookmark);
			Bookmarks bookmarks_2 = (Bookmarks) unmarshal(jaxbUnmarshaller,
					location_list);
			System.out.println(bookmarks_2);
			Bookmark bookmark_2 = (Bookmark) unmarshal(jaxbUnmarshaller,
					location);
			System.out.println(bookmark_2);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}