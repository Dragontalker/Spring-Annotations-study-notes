package com.dragontalker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dragontalker.bean.Person;

@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		return new Person("lisi", 20);
	}
}
