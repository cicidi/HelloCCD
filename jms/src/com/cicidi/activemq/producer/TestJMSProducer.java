package com.cicidi.activemq.producer;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJMSProducer {
	public static void main(String[] args) throws JMSException {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "com/cicidi/activemq/config/JMSConfig.xml" });
		MessageProducer myBean = (MessageProducer) context
				.getBean("simpleMessageProducer");
		myBean.sendMessages();
	}
}
