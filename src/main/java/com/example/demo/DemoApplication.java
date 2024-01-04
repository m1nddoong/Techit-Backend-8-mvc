package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// @EnableAutoConfiguration + @ComponentScan =
// @SpringBootApplication
// 이 클래스를 Spring Boot로서 자동 설정을 하게끔
@EnableAutoConfiguration
// 이 클래스를 기준으로 Bean 객체를 검색하게 하는 어노테이션
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		// ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplication.class);
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class);
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}


	}
}






