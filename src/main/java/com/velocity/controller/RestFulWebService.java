package com.velocity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.student.Employee;
import com.velocity.student.Student;

@RestController
public class RestFulWebService {

// design a restful web service which return string
	@GetMapping("/springBootFirstApi")
	public String springBootFirstApi() {
		return "Welcome To Spring Boot Project";
	}

// design a restful web service which return student details	
	@Autowired
	private Student student;

	@GetMapping("/getDetails")
	public Student getDetails() {
		student.setId(101);
		student.setName("Rushikesh Bhuyar");
		student.setAddress("MG Road");
		student.setCity("Pune Maharashtra");
		student.setCountry("India");
		return student;
	}

	// Design a restful webservice which returns list of employee

	@GetMapping("/getInfo")
	public static  List<Employee> getInfo() {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(11, "Anil kapoor", "Delhi", "1200"));
		list.add(new Employee(12, "Om kapoor", "Patna", "1000"));
		list.add(new Employee(13, "Nana Patekar", "Mumbai", "700"));
		list.add(new Employee(14, "Jhony liver", "Mumbai", "300"));
		list.add(new Employee(11, "Asu Uddinsidaqe", "Lucknow", "900"));
   for (Employee employee : list) {
	   System.out.println(employee);
}
   return list;
	}
}
