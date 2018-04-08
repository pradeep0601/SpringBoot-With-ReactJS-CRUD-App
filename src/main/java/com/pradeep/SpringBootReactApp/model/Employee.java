package com.pradeep.SpringBootReactApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Pradeep
 * @Data is a Project Lombok annotation to autogenerate getters, setters,
 *       constructors, toString, hash, equals, and other things. It cuts down on
 *       the boilerplate
 */

@Entity
public class Employee {

	private int employeeId;
	private String name;
	private float age;
	private String department;
	private String designation;

	public Employee() {
		
	}
	public Employee(String name, float age, String department, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.designation = designation;
	}

	@Id
	@GeneratedValue
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", department=" + department
				+ ", designation=" + designation + "]";
	}

}
