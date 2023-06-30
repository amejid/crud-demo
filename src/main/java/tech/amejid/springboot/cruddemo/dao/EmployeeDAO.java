package tech.amejid.springboot.cruddemo.dao;

import tech.amejid.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
