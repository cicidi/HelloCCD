package com.cicidi.ssh.bo;

import com.cicidi.ssh.model.Student;

public interface StudentBo {
	void save(Student student);

	void update(Student student);

	void delete(Student student);

	Student findByID(int id);
}
