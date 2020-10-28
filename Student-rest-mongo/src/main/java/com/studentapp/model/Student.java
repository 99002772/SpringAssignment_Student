package com.studentapp.model;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
//import org.springframework.stereotype.Component;


public class Student {
	@Id
	int stdId;
	String name;
	int age;
	String department;
	Address address;
	
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, int stdId, int age, String department, Address address) {
		super();
		this.name = name;
		this.stdId = stdId;
		this.age = age;
		this.department = department;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", address=" + address + "]";
	}
	
	
}
