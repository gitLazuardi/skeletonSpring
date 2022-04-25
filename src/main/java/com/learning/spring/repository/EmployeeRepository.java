package com.learning.spring.repository;

import com.learning.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}
