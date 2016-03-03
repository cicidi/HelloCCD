package com.cicidi.ssh.bo;

import org.springframework.stereotype.Service;

import com.cicidi.ssh.model.Model;

@Service
public interface AbstractBo {
	void save(Model Model);

	void update(Model Model);

	void delete(Model Model);

	Model findByID(int id);
}
