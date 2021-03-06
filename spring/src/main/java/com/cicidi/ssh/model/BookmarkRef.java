package com.cicidi.ssh.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement()
// 如果没有 name 这个属性，那么 BookmarkRef 就不好用，必须使用Bookmark 才行 code 会之认识class “Bookmark“
// = root tag “bookmark“
public class BookmarkRef {

	private String id;
	private String url;
	private String tags;
	private String href;
	private Date time;
	private String content;

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

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
