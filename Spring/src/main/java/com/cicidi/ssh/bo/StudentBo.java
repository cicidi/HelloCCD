package com.cicidi.ssh.bo;

import org.springframework.stereotype.Component;

import com.cicidi.ssh.model.Model;

@Component
public interface StudentBo extends AbstractBo {
	void save(Model student);

	void update(Model student);

	void delete(Model student);

	Model findByID(int id);
}
