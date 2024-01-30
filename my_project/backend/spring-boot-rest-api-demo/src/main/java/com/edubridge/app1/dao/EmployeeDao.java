package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Employee;
import com.edubridge.app1.repo.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	private EmployeeRepository repo;
   
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	
		
	}
	public List<Employee> getEmployees(){
		return repo.findAll();
		
	}
	public Employee getEmployee(Integer employeeId) {
		return repo.findById(employeeId).get();
	}
	public void updateEmployee(Employee e) {
		repo.save(e);
	}
	public void deleteEmployee(Integer employeeId){
		repo.deleteById(employeeId);
	}
}
