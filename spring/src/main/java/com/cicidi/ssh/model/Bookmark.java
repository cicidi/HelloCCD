package com.cicidi.ssh.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Bookmark")
@XmlRootElement
<<<<<<< HEAD
public class Bookmark {
	@Id
	// if use GeneratedValue id can not be string
//	@GeneratedValue
=======
public class Bookmark implements Model {
	@Id
	// if use GeneratedValue id can not be string
	// @GeneratedValue
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31
	@Column(name = "id")
	private int id;
	@Column
	private String url;
	@Column
	private Date time;
	@Column
	private String description;
	@JoinColumn(name = "id_FK")
	// @OneToOne( fetch = FetchType.LAZY)
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Tags tags;

	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

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

	@XmlElement(name = "tags")
	public void setTags(Tags tags) {
		this.tags = tags;
	}

}
