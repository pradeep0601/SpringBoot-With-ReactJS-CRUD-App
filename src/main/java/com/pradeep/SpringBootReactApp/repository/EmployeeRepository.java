package com.pradeep.SpringBootReactApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pradeep.SpringBootReactApp.model.Employee;

@CrossOrigin(origins = "http://localhost:3000")
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
