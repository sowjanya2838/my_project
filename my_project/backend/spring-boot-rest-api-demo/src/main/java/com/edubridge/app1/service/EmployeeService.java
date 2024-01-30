package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.EmployeeDao;
import com.edubridge.app1.model.Employee;

@Service
public class EmployeeService {
@Autowired
private EmployeeDao dao;
public Employee saveEmployee(Employee e) {
	return dao.saveEmployee(e);

}
public List<Employee> getEmployees(){
	return dao.getEmployees();	
}
public Employee getEmployee(Integer employeeId) {
	return dao.getEmployee(employeeId);
}
public void updateEmployee(Employee e) {
	dao.updateEmployee(e);
}
public void deleteEmployee(Integer employeeId){
	dao.deleteEmployee(employeeId);
}
}
