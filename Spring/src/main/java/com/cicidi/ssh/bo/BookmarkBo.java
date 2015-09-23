package com.cicidi.ssh.bo;

import org.springframework.stereotype.Component;

import com.cicidi.ssh.model.Bookmark;


public interface BookmarkBo {
	void save(Bookmark Bookmark);

	void update(Bookmark Bookmark);

	void delete(Bookmark Bookmark);

	Bookmark findByID(int id);
}
