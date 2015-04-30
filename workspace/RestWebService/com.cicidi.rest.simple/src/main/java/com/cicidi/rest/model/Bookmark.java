package com.cicidi.rest.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bookmark extends AbstractBookmark{
	private String url;
	private Date time;
	private String description;
	private Tags tags;

	public String getUrl() {
		return url;
	}

	@XmlAttribute
	public void setUrl(String url) {
		this.url = url;
	}

	public Date getTime() {
		return time;
	}

	@XmlAttribute
	public void setTime(Date time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	public Tags getTags() {
		return tags;
	}

	@XmlElement
	public void setTags(Tags tags) {
		this.tags = tags;
	}

}
