package com.cicidi.ssh.bo;

<<<<<<< HEAD
import org.springframework.stereotype.Component;

import com.cicidi.ssh.model.Bookmark;


public interface BookmarkBo {
	void save(Bookmark Bookmark);

	void update(Bookmark Bookmark);

	void delete(Bookmark Bookmark);

	Bookmark findByID(int id);
=======
import com.cicidi.ssh.model.Model;

public interface BookmarkBo extends AbstractBo {
	void save(Model Bookmark);

	void update(Model Bookmark);

	void delete(Model Bookmark);

	Model findByID(int id);
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31
}
