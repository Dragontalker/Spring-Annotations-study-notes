package com.dragontalker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dragontalker.bean.Person;

@Configuration
public class MainConfig {

	@Bean("person")
	public Person person01() {
		return new Person("lisi", 20);
	}
}
