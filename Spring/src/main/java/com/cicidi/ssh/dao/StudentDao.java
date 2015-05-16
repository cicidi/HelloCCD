package com.cicidi.ssh.dao;

import org.springframework.stereotype.Repository;

import com.cicidi.ssh.model.Student;

@Repository
public interface StudentDao {

	public void save(Student student);

	public Student findById(int id);

	public void update(Student student);

	public void delete(Student student);
}
