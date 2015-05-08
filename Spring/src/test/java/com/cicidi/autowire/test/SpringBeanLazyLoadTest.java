package com.cicidi.autowire.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringAppContext.class })
public class SpringBeanLazyLoadTest {
	@Autowired
	private HelloWorld helloworld2;

	@Test
	// this test is lame but just trying out.
	public void print() {
		System.out.println("Autowired: " + helloworld2);
	}
}