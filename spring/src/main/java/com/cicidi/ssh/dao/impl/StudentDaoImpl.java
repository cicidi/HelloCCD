package com.cicidi.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cicidi.ssh.dao.StudentDao;
import com.cicidi.ssh.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		// Session session = sessionFactory.openSession();
		// Transaction trans = session.beginTransaction();

		session.saveOrUpdate(student);
		// trans.commit();
		// session.close();
		System.out.println("commit;");
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("good init");
		Session session = sessionFactory.getCurrentSession();
		// Session session = sessionFactory.openSession();
		// Transaction trans = session.beginTransaction();

		Student student = (Student) session.get(Student.class, id);
		System.out.println("good get");
		// trans.commit();
		// session.close();
		return student;

	}

	public void update(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		// Session session = sessionFactory.openSession();
		// Transaction trans = session.beginTransaction();
		session.update(student);
		// trans.commit();

	}

	public void delete(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		// Transaction trans = session.beginTransaction();
		sessionFactory.getCurrentSession().delete(student);
		// trans.commit();
	}

}
