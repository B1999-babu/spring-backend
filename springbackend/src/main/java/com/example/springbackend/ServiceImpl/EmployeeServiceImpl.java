package com.example.springbackend.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbackend.Exception.ResourseNotFoundException;
import com.example.springbackend.Model.Employee;
import com.example.springbackend.Repository.EmployeeRepository;
import com.example.springbackend.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeerepo;
	
	public EmployeeServiceImpl(EmployeeRepository employeerepo) {
		super();
		this.employeerepo = employeerepo;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeerepo.save(employee);
	}



	@Override
	public List<Employee> getAllEmployee() {
		
		return employeerepo.findAll();
	}



	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee=employeerepo.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourseNotFoundException("Employee","Id",id);
//		}
	return employeerepo.findById(id).orElseThrow(
			() ->new ResourseNotFoundException("Employee","Id",id));	
	
	}

}
