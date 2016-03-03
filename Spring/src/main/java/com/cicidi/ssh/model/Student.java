package com.cicidi.ssh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

<<<<<<< HEAD
@Entity()
public class Student {
=======
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
// @Component
// @Scope("prototype")
public class Student implements Model {
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31
	@Id
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String college;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
