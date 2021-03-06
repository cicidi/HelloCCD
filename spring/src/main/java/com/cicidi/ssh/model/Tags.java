package com.cicidi.ssh.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Tags")
@XmlRootElement(name = "tags")
public class Tags {
	@Id
	// @GeneratedValue
	@Column(name = "id_PK")
	// http://stackoverflow.com/questions/29241266/hibernate-com-mysql-jdbc-exceptions-jdbc4-mysqlsyntaxerrorexception-unknown-co
	private int id;
	@Column
	private String count;
	@Column
	@OneToMany(targetEntity = Tag.class, cascade = CascadeType.ALL)
	private List<Tag> tag;

	// @OneToOne(fetch = FetchType.LAZY)
	// @PrimaryKeyJoinColumn
	// //
	// http://stackoverflow.com/questions/8870007/hibernate-mapping-exception-could-not-determine-type-for-columns-org-hibernat
	// private Bookmark bookmark;

	// http://www.mkyong.com/hibernate/hibernate-one-to-one-relationship-example-annotation/

	// public Bookmark getBookmark() {
	// return bookmark;
	// }
	//
	// @XmlTransient
	// public void setBookmark(Bookmark bookmark) {
	// this.bookmark = bookmark;
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCount() {
		return count;
	}

	@XmlAttribute
	public void setCount(String count) {
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
