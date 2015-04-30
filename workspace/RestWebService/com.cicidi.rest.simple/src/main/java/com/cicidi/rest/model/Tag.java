package com.cicidi.rest.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tag {

	private String name;
	private String href;

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	@XmlAttribute
	public void setHref(String href) {
		this.href = href;
	}
}
