package com.example.lecture13.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lecture13Application {

	public static void main(String[] args) {
		SpringApplication.run(Lecture13Application.class, args);
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Lecture13Application.class);

		String[] beanNames = context1.getBeanDefinitionNames();

//		context1.registerBean("SecondTest",Person.class);

		for (String beanName: beanNames) {
			System.out.println(beanName);
		}

		Person personBean = context1.getBean(Person.class);
		System.out.println(personBean.getName());

		System.out.println(context1.getBean("student", Student.class).getPerson().getName());


	}
}
