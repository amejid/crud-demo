package tech.amejid.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.amejid.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
