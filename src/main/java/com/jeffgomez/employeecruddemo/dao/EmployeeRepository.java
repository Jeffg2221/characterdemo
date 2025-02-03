package com.jeffgomez.employeecruddemo.dao;

import com.jeffgomez.employeecruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
