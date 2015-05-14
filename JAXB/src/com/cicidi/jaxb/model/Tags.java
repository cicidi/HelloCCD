package com.cicidi.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tags {
	private int count;
	private List<Tag> tag;

	public int getCount() {
		return count;
	}

	@XmlAttribute
	public void setCount(int count) {
		this.count = count;
	}

	public List<Tag> getTag() {
		return tag;
	}

	@XmlElement
	public void setTag(List<Tag> tagList) {
		this.tag = tagList;
	}

}
