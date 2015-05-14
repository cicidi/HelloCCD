package com.cicidi.ssh.bo.impl;

import org.springframework.transaction.annotation.Transactional;

import com.cicidi.ssh.bo.StudentBo;
import com.cicidi.ssh.dao.StudentDao;
import com.cicidi.ssh.model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	/*
	 * if　I want to use transactional I need to delete this in hibernate config
	 * <property name="current_session_context_class">thread</property> --> I
	 * think transactions belong on the Service layer. It's the one that knows
	 * about units of work and use cases. It's the right answer if you have
	 * several DAOs injected into a Service that need to work together in a
	 * single transaction.
	 */
	@Transactional
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

	@Transactional
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}

	@Transactional
	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentDao.delete(student);
	}

	@Transactional
	public Student findByID(int id) {
		// TODO Auto-generated method stub
		studentDao.findById(id);
		return studentDao.findById(id);
	}
}