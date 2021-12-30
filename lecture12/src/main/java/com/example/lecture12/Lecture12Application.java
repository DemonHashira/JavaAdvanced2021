package com.example.lecture12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Lecture12Application {

	public ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(Lecture12Application.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		list.add(name);
		return String.format("Hello %s!", name);
	}

	@GetMapping("/all")
		public ArrayList<String> all() {
			return list;
	}

	@PostMapping("/hello")
	public void postHello(@RequestBody HelloExample hello) {
		System.out.println(hello.getExample());
	}

	@GetMapping("/helloExample")
	public HelloExample helloExampleMethod() {
		HelloExample helloExample = new HelloExample();
		helloExample.setExample("This is an example");
		return helloExample;
	}
}
