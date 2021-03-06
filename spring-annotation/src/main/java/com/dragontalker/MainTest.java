package com.dragontalker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dragontalker.bean.Person;
import com.dragontalker.config.MainConfig;

public class MainTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		String[] namesForType = context.getBeanNamesForType(Person.class);
		for (String name: namesForType) {
			System.out.println(name);
		}
		
		context.close();
	}
}
