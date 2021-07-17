package com.dragontalker;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragontalker.bean.Person;

public class MainTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		
		context.close();
	}
}
