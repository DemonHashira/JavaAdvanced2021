package com.example.lecture13.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lecture13Application {

	public static void main(String[] args) {

		SpringApplication.run(Lecture13Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Lecture13Application.class);

		context.registerBean("SecondTest",Person.class);

		String[] beanNames = context.getBeanDefinitionNames();

		for (String beanName: beanNames){
			System.out.println(beanName);
		}




		System.out.println(context.getBean("Jack",Person.class).getName());

		System.out.println(context.getBean("person",Person.class).getName());

		System.out.println(context.getBean("student", Student.class).getPerson().getName());




	}

}