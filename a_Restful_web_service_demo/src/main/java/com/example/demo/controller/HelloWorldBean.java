package com.example.demo.controller;

public class HelloWorldBean {
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		//return "HelloWorldBean [message=" + message + "]";
		return message;
	}
	
}
