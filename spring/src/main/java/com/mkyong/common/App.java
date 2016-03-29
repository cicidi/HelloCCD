package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans/Spring-Module.xml");

		// HelloWorld obj = (HelloWorld) context.getBean("helloBean")
		// HelloWorld obj = (HelloWorld)
		// context.getBean("helloBean");fdj;ldfkjasdf
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();

	}
}