package com.javabeat;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/beans/Beans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("singletonscope");
		System.out.println("*********SINGLETON SCOPE************");
		objA.setMessage("Message by object A");
		objA.setDate(new Date());
		System.out.println("Your Message : " + objA.getMessage());
		System.out.println("Date : " + objA.getDate().toString());

		HelloWorld objB = (HelloWorld) context.getBean("singletonscope");
		System.out.println("Your Message : " + objB.getMessage());
		System.out.println("Date : " + objB.getDate().toString());
		System.out.println("********************************");

		HelloWorld objC = (HelloWorld) context.getBean("prototypescope");
		System.out.println("*********PROTOTYPE SCOPE************");
		objC.setMessage("Message by object C");
		objC.setDate(new Date());
		System.out.println("Your Message : " + objC.getMessage());
		System.out.println("Date : " + objC.getDate().toString());

		HelloWorld objD = (HelloWorld) context.getBean("prototypescope");
		System.out.println("Your Message : " + objD.getMessage());
		System.out.println("Your Date : " + objD.getDate());

		System.out.println("********************************");
	}
}
