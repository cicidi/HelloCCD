package com.cicidi.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cicidi.ssh.bo.AbstractBo;
import com.cicidi.ssh.model.Model;
import com.cicidi.ssh.model.Student;

//@Controller
@RequestMapping("/topology")
public class Topology {
	@Autowired
	@Qualifier("studentBo")
	AbstractBo studentBo;
	// @Autowired
	// @Qualifier("student")
	Model student;

	public Model getStudent() {
		return student;
	}

	public Model createStudent() {
		return null;
	};

	public void setStudent(Model student) {
		this.student = student;
	}

	private static final Logger logger = LoggerFactory
			.getLogger(Topology.class);

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String add(@PathVariable String name, ModelMap model) {
		model.addAttribute("movie", name);
		return "list";// what dose list mean ?
	}

	/*
	 * Answer: here it returns list mean it gonna to to list.jsp page the surfix
	 * is configured in web.xml
	 */
	/*
	 * so if it is gonna use rest call only, like make a call from java class we
	 * gonna use the next example
	 */

	// Tip
	// , headers = { "Accept=*/*" }, produces = "application/json"
	/*
	 * Just before I got the same 406 error, I have the add code above in
	 * 
	 * @RequestMapping but now I do not know why it is working only without this
	 * code, And this can also parse to json string automatically. I think it's
	 * because jason bean config works
	 */
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public @ResponseBody Model getEmployee(@PathVariable("id") String stdId) {
		logger.info("Start getEmployee. ID=" + stdId);
		// Student std = new Student();
		student = createStudent();
		logger.info("cicidi :" + student.toString());
		Student std = (Student) student;
		std.setStudentId(Integer.valueOf(stdId));
		std.setStudentName("createByLookup");
		System.out.println("cicidi :" + std.getStudentName());
		if (stdId.equals("1")) {
			System.out.println("cicidi");
			std.setStudentName("name1");
		}
		// else
		// ((Student) student).setStudentName("othername");
		studentBo.save(std);
		student = (Student) studentBo.findByID(Integer.valueOf(stdId));
		// Gson gson = new Gson();
		// String str = gson.toJson(std);
		return student;

	}
}
