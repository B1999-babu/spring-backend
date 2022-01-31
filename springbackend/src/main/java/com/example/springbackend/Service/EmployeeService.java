package com.example.springbackend.Service;

import java.util.List;

import com.example.springbackend.Model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(long id);
}
