package com.velocity;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.velocity.controller.RestFulWebService;
import com.velocity.student.Employee;

@SpringBootApplication
public class SpringBootOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOperationApplication.class, args);
		System.err.println("My application is running");
		 
		List<Employee> data=RestFulWebService.getInfo();
		System.err.println(data);
	}

}
