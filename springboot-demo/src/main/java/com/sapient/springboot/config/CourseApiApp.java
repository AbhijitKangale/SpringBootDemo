package com.sapient.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.sapient.springboot.*" })
@EntityScan("com.sapient.springboot.jpa")
@EnableJpaRepositories("com.sapient.springboot.dao.repo")
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
