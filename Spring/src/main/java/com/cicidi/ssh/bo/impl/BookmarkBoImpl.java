package com.cicidi.ssh.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cicidi.ssh.bo.BookmarkBo;
import com.cicidi.ssh.dao.BookmarkDao;
import com.cicidi.ssh.model.Bookmark;
<<<<<<< HEAD
=======
import com.cicidi.ssh.model.Model;
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31

@Component("bookmarkBo")
public class BookmarkBoImpl implements BookmarkBo {
	@Autowired
	private BookmarkDao bookmarkDao;

	public BookmarkDao getBookmarkDao() {
		return bookmarkDao;
	}

	public void setBookmarkDao(BookmarkDao BookmarkDao) {
		this.bookmarkDao = BookmarkDao;
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
<<<<<<< HEAD
	public void save(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		bookmarkDao.save(Bookmark);
	}

	@Transactional
	public void update(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		bookmarkDao.update(Bookmark);
	}

	@Transactional
	public void delete(Bookmark Bookmark) {
		// TODO Auto-generated method stub
		bookmarkDao.delete(Bookmark);
	}

	@Transactional
	public Bookmark findByID(int id) {
=======
	public void save(Model Model) {
		// TODO Auto-generated method stub
		bookmarkDao.save((Bookmark) Model);
	}

	@Transactional
	public void update(Model Model) {
		// TODO Auto-generated method stub
		bookmarkDao.update((Bookmark) Model);
	}

	@Transactional
	public void delete(Model Model) {
		// TODO Auto-generated method stub
		bookmarkDao.delete((Bookmark) Model);
	}

	@Transactional
	public Model findByID(int id) {
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31
		// TODO Auto-generated method stub
		bookmarkDao.findById(id);
		return bookmarkDao.findById(id);
	}
}
