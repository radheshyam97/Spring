package com.test.hello.service;

public class HelloService {
	String message;

	public HelloService() {
		message = "Hello Spring Framework(Default Message)";
	}

	public HelloService(String message) {

		this.message = message;

	}

	public String getMessage() {

		return message;
	}

}
