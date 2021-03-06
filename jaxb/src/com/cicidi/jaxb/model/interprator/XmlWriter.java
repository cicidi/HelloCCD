package com.cicidi.jaxb.model.interprator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.cicidi.jaxb.model.AbstractBookmark;
import com.cicidi.jaxb.model.Bookmark;
import com.cicidi.jaxb.model.Bookmarks;

public class XmlWriter {
	public void write(Bookmark instance) {

		try {

			File file = new File("resources/" + "copy" + ".java");
			JAXBContext jaxbContext = JAXBContext.newInstance(Bookmark.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(instance, file);
			jaxbMarshaller.marshal(instance, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	public static void marshller(AbstractBookmark ref) throws JAXBException {
		Marshaller jaxbMarshaller = ModelJAXBContext.initContext()
				.createMarshaller();
		;
		File file = new File("resources/"
				+ ref.getClass().getSimpleName().toLowerCase() + "_copy"
				+ ".xml");

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(ref, file);
		jaxbMarshaller.marshal(ref, System.out);
	}

	public static void main(String[] arg) throws JAXBException {

		final String TARGET = "bookmarks";

		AbstractBookmark intance = XmlReader.unmarshall(TARGET, null);

		marshller(intance);

	}
}
