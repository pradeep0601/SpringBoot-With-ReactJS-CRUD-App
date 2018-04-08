package com.pradeep.SpringBootReactApp.dbloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pradeep.SpringBootReactApp.model.Employee;
import com.pradeep.SpringBootReactApp.repository.EmployeeRepository;

@Component
public class DataBaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DataBaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		this.repository.save(new Employee("Pradeep", 31, "Software Development", "Technical Lead"));
		System.out.println(this.repository.findAll());

	}

}
