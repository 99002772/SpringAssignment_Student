package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	Student getStudentById(int id);
	boolean deleteStudent(int id);
	
	
	List <Student> getStudentByAddressCity(String city);
	List <Student> getStudentByDepartment(String department);
	
	List<Student>findByAge(int age);
	


}
