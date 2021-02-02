package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployee() {
		return new Employee();
	}
	@Bean
	@Scope(scopeName = "prototype")
	public Address getAddress() {
		return new Address();
	}
	
}
