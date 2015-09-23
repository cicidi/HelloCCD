package com.cicidi.ssh.dao;

import org.springframework.stereotype.Repository;

import com.cicidi.ssh.model.Bookmark;

@Repository
public interface BookmarkDao {

	public void save(Bookmark Bookmark);

	public Bookmark findById(int id);

	public void update(Bookmark Bookmark);

	public void delete(Bookmark Bookmark);
}
