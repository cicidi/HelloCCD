package com.cicidi.ssh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "tag")
public class Tag {
	@Id
	// @GeneratedValue
	private String name;
	@Column
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
