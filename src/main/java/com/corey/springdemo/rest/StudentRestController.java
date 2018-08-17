package com.corey.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corey.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// Define endpoint for "/students" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Michael", "Scott"));
		theStudents.add(new Student("Jim", "Halpert"));
		theStudents.add(new Student("Pam", "Beesly"));
		
		return theStudents;
	}

}
