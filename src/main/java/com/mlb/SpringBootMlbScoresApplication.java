package com.mlb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMlbScoresApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootMlbScoresApplication.class, args);

//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
		System.out.println("**** Spring Boot Mlb Application started... ****");		
	}
}
