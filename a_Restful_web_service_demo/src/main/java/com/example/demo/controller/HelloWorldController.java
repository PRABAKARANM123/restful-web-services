package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorldController {
	@GetMapping("hello-world")
	public String helloWorld() {
		return "Hello World java";
	}
	
	@GetMapping("hello-world-bean")
	public HelloWorldBean bean() {
		return new HelloWorldBean("Welcome To Java World");
	}
	
	@GetMapping("hello-world-path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(name);
		
	}

}
