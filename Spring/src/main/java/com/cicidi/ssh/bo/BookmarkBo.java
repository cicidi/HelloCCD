package com.cicidi.ssh.bo;

import com.cicidi.ssh.model.Model;

public interface BookmarkBo extends AbstractBo {
	void save(Model Bookmark);

	void update(Model Bookmark);

	void delete(Model Bookmark);

	Model findByID(int id);
}
