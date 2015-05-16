package com.cicidi.ssh.bo;

import org.springframework.stereotype.Component;

import com.cicidi.ssh.model.Student;

@Component
public interface StudentBo {
	void save(Student student);

	void update(Student student);

	void delete(Student student);

	Student findByID(int id);
}
