package com.cicidi.ssh.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cicidi.ssh.bo.BookmarkBo;
import com.cicidi.ssh.dao.BookmarkDao;
import com.cicidi.ssh.model.Bookmark;
import com.cicidi.ssh.model.Model;

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
		// TODO Auto-generated method stub
		bookmarkDao.findById(id);
		return bookmarkDao.findById(id);
	}
}
