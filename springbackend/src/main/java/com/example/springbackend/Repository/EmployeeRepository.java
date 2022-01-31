package com.example.springbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbackend.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee ,Long>{

}
