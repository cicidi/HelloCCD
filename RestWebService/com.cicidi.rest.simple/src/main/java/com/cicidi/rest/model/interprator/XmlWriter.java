package com.cicidi.rest.model.interprator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.cicidi.rest.model.AbstractBookmark;
import com.cicidi.rest.model.Bookmark;
import com.cicidi.rest.model.Bookmarks;

public class XmlWriter {
	public void write(Bookmark instance) {

		try {

			File file = new File("src/main/resources/" + "copy" + ".java");
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
		Marshaller jaxbMarshaller = null;
		File file = new File("src/main/resources/"
				+ ref.getClass().getSimpleName().toLowerCase() + "_copy"
				+ ".xml");
		if (ref instanceof Bookmarks) {
			// file = new File("src/main/resources/"
			// + ref.getClass().getSimpleName() + "_copy" + ".xml");
			jaxbMarshaller = BookmarkListJAXBContext.initContext()
					.createMarshaller();
		}
		if (ref instanceof Bookmark) {
			// file = new File("src/main/resources/" + "Bookmark" + "_copy"
			// + ".xml");
			jaxbMarshaller = BookmarkJAXBContext.initContext()
					.createMarshaller();
		}

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(ref, file);
		jaxbMarshaller.marshal(ref, System.out);
	}

	public static void main(String[] arg) throws JAXBException {
		//
		// Bookmark bookmarksintance = new Bookmark();
		// bookmarksintance.setDescription("abc");
		// bookmarksintance.setTime(new Date());
		// bookmarksintance.setUrl("http:cicidi");
		// List<Tag> tagList = new ArrayList<Tag>();
		// Tag tag = new Tag();
		// tag.setHref("http://tag");
		// tag.setName("mytag1");
		//
		// Tag tag2 = new Tag();
		// tag2.setHref("http://tag2");
		// tag2.setName("mytag2");
		//
		// tagList.add(tag);
		// tagList.add(tag2);
		// Tags tags = new Tags();
		// tags.setTag(tagList);
		// bookmarksintance.setTags(tags);
		//
		// Bookmarks bookmarks = new Bookmarks();
		// bookmarks.setStart("start");
		// bookmarks.setEnd("end");
		// List<Bookmark> bookmark = new ArrayList<Bookmark>();
		// bookmark.add(bookmarksintance);
		// bookmark.add(bookmarksintance);

		// ---------------------------------------------
		// Bookmarks bookmarks = new Bookmarks();
		// bookmarks.setStart("1");
		// bookmarks.setEnd("0");
		// BookmarkRef bookmarkref = new BookmarkRef();
		// bookmarkref.setContent("ContentsDep");
		// bookmarkref.setHref("http://sdksjdkjsdk");
		// bookmarkref.setTags("example.test");
		// bookmarkref.setUrl("http://urlsdsdsd");
		// bookmarkref.setTime(new Date());
		// List<BookmarkRef> bookmarkRefs = new ArrayList<BookmarkRef>();
		// bookmarkRefs.add(bookmarkref);
		// bookmarkRefs.add(bookmarkref);
		// bookmarks.setBookmark(bookmarkRefs);

		final String TARGET = "bookmarks";
		// try {
		AbstractBookmark intance = XmlReader.unmarshall(TARGET, null);
		// File file = new File("src/main/resources/" + TARGET + "_copy"
		// + ".xml");
		// JAXBContext jaxbContext = JAXBContext.newInstance(Bookmarks.class);
		// Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		//
		// // output pretty printed
		// jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//
		// jaxbMarshaller.marshal(intance, file);
		// jaxbMarshaller.marshal(intance, System.out);
		//
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }
		marshller(intance);
		// marshller(bookmark);

	}
}