package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.studentapp.dao.StudentRepository;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;

@Service
@Repository
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student newstudent = studentRepository.save(student);
		return newstudent;
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id) 
		.orElseThrow(() -> new StudentNotFoundException("Id not available"));
		
	}

	@Override
	public boolean deleteStudent(int id) throws StudentNotFoundException {
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Student> getStudentByAddressCity(String city) throws StudentNotFoundException {
		return  studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentByDepartment(String department) throws StudentNotFoundException {
		return  studentRepository.findByDepartment(department);
	}

	@Override
	public List<Student> findByAge(int age) throws StudentNotFoundException {
		return  studentRepository.findByAge(age);
	}

	

}
