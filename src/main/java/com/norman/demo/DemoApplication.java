package com.norman.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jws.WebMethod;

@SpringBootApplication
public class DemoApplication {
	@WebMethod
	public String sayHelloWorldFrom(String from) {
		String result = "Hello, world, from " + from;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
