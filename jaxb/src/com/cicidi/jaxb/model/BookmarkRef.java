package com.cicidi.jaxb.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class BookmarkRef extends AbstractBookmark {
	private String url;
	private String tags;
	private String href;
	private Date time;
	private String content;

	public String getUrl() {
		return url;
	}

	@XmlAttribute
	public void setUrl(String url) {
		this.url = url;
	}

	public String getTags() {
		return tags;
	}

	@XmlAttribute
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getHref() {
		return href;
	}

	@XmlAttribute
	public void setHref(String href) {
		this.href = href;
	}

	public Date getTime() {
		return time;
	}

	@XmlAttribute
	public void setTime(Date time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	@XmlValue
	public void setContent(String content) {
		this.content = content;
	}

}
