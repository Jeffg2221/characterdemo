package com.jeffgomez.employeecruddemo.dao;

import com.jeffgomez.employeecruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    @Override
    public List<Employee> findAll() {
        return List.of();
    }
}
