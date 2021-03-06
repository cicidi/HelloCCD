package com.cicidi.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cicidi.ssh.dao.BookmarkDao;
import com.cicidi.ssh.model.Bookmark;

@Repository("bookmarkDao")
public class BookmarkDaoImpl implements BookmarkDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(Bookmark);
		// session.save(Bookmark);
		System.out.println("commit;");
	}

	public Bookmark findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("good init");
		Session session = sessionFactory.getCurrentSession();
		Bookmark Bookmark = (Bookmark) session.get(Bookmark.class, id);
		System.out.println("good get");

		return Bookmark;

	}

	public void update(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(Bookmark);

	}

	public void delete(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().delete(Bookmark);
	}

}
