package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.Employee;
import com.edubridge.app1.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeecController {
	@Autowired
	private EmployeeService service;
	/*
	 *http://localhost:8181/myapp/api/employee
	 * 
	 * */
	 
	//save employee
	//@GetMapping("/employee")
	@PostMapping("/employee")
	public ResponseEntity<Employee> save(@RequestBody Employee employee){
		Employee savedEmployee=service.saveEmployee(employee);
	return	new ResponseEntity<>(savedEmployee,HttpStatus.OK);
	
}
	//get all employees
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees  =  service.getEmployees();
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
	
	//get one employee
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable("id")  Integer employeeId){
		Employee employee=service.getEmployee(employeeId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	//delete one employee
		@DeleteMapping("/employee/{id}")
		public ResponseEntity<Employee> deleteOneEmployee(@PathVariable("id")  Integer employeeId){
			service.deleteEmployee(employeeId);
			return new ResponseEntity<Employee>(HttpStatus.OK);
		}
		//update employee...
		@PutMapping("/employee")
		public ResponseEntity<Employee> update(@RequestBody Employee employee){
			service.saveEmployee(employee);
		return	new ResponseEntity<>(HttpStatus.OK);
		
	}
}