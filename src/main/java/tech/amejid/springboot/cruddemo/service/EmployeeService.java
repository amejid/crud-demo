package tech.amejid.springboot.cruddemo.service;

import tech.amejid.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
