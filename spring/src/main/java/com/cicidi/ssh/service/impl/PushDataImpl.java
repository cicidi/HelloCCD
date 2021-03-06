package com.cicidi.ssh.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cicidi.ssh.bo.BookmarkBo;
import com.cicidi.ssh.model.Bookmark;
import com.cicidi.ssh.model.jaxbInterprator.XmlReader;
import com.cicidi.ssh.service.IPushData;

public class PushDataImpl implements IPushData {
	public void push() {
		List list = XmlReader.load();
		for (Object obj : list) {
			if (obj instanceof Bookmark) {
				@SuppressWarnings("resource")
				ApplicationContext appContext = new ClassPathXmlApplicationContext(
						"config/BeanLocations.xml");
				BookmarkBo bookmarkBo = (BookmarkBo) appContext
						.getBean("bookmarkBo");
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		List list = XmlReader.load();
		for (Object obj : list) {
			if (obj instanceof Bookmark) {
				@SuppressWarnings("resource")
				ApplicationContext appContext = new ClassPathXmlApplicationContext(
						"config/BeanLocations.xml");
				BookmarkBo bookmarkBo = (BookmarkBo) appContext
						.getBean("bookmarkBo");
				((Bookmark) obj).setId(13);

				((Bookmark) obj).getTags().setId(123);
				bookmarkBo.save((Bookmark) obj);
				System.out.print(obj);
			}
		}
	}
}
