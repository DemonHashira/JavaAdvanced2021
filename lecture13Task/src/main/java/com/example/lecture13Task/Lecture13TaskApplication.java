package com.example.lecture13Task;

import com.example.lecture13Task.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lecture13TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lecture13TaskApplication.class, args);
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Lecture13TaskApplication.class);

		String[] beanNames = context1.getBeanDefinitionNames();

//		context1.registerBean("SecondTest",Person.class);

		for (String beanName: beanNames) {
			System.out.println(beanName);
		}

		Person personBean = context1.getBean(Person.class);
		System.out.println(personBean.getName());


	}

}
