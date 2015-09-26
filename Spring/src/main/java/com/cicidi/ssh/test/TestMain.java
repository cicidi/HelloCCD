package com.cicidi.ssh.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cicidi.ssh.bo.StudentBo;
import com.cicidi.ssh.model.Student;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"config/BeanLocations.xml");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		StudentBo studentBo = (StudentBo) appContext.getBean("studentBo");

		/** insert **/
		Student student = new Student();
		// student.setStudentId((new Random()).nextInt(100));
		student.setStudentId(1317);
		student.setStudentName(dateFormat.format(new Date()));
		studentBo.save(student);

		/** select **/
		Student student2 = (Student) studentBo.findByID(1317);
		System.out.println(student2);

		/** update **/
		student2.setStudentName(dateFormat.format(new Date()));
		studentBo.update(student2);

		/** delete **/
		// studentBo.delete(student2);

		System.out.println("Done");
	}
}