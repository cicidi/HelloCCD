package com.cicidi.autowire.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class SpringAppContext_2 {

	@Bean(name = "helloworld1")
	public HelloWorld helloworld1() {
		return new HelloWorld("helloworld1");
	}

	@Bean(name = "helloworld2")
	public HelloWorld helloworld2() {
		return new HelloWorld("helloworld2");
	}
}