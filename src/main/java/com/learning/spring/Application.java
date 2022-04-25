package com.learning.spring;

import com.learning.spring.model.Employee;
import com.learning.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class Application implements CommandLineRunner {
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//
//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Hadi");
//		employee.setLastName("Lazuardi");
//		employee.setEmail("hadilazuardii@gmail.com");
//		employeeRepository.save(employee);
//	}
}
