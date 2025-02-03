package com.jeffgomez.employeecruddemo.dao;

import com.jeffgomez.employeecruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
