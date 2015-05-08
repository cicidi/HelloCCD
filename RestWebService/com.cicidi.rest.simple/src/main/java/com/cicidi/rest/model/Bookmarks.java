package com.cicidi.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bookmarks extends AbstractBookmark {
	private String start;
	private String end;
	private String next;
	private List<BookmarkRef> bookmark;

	public List<BookmarkRef> getBookmark() {
		return bookmark;
	}

	@XmlElement
	public void setBookmark(List<BookmarkRef> bookmark) {
		this.bookmark = bookmark;
	}

	public String getStart() {
		return start;
	}

	@XmlAttribute
	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	@XmlAttribute
	public void setEnd(String end) {
		this.end = end;
	}

	public String getNext() {
		return next;
	}

	@XmlAttribute
	public void setNext(String next) {
		this.next = next;
	}

}
