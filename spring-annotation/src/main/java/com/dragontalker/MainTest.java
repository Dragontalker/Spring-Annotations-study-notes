package com.dragontalker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragontalker.bean.Person;
import com.dragontalker.config.MainConfig;

public class MainTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		
		context.close();
	}
}
