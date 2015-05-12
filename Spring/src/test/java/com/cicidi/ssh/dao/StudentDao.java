package com.cicidi.ssh.dao;

import com.cicidi.ssh.model.Student;

public interface StudentDao {
	public void save(Student student);

	public Student findById(int id);

	public void update(Student student);

	public void delete(Student student);
}
