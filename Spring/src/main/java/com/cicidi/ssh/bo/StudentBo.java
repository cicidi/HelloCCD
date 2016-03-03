package com.cicidi.ssh.bo;

import org.springframework.stereotype.Component;

<<<<<<< HEAD
import com.cicidi.ssh.model.Student;

@Component
public interface StudentBo {
	void save(Student student);

	void update(Student student);

	void delete(Student student);

	Student findByID(int id);
=======
import com.cicidi.ssh.model.Model;

@Component
public interface StudentBo extends AbstractBo {
	void save(Model student);

	void update(Model student);

	void delete(Model student);

	Model findByID(int id);
>>>>>>> 68ff944a24404430a367bf3c6548d19eba96cf31
}
