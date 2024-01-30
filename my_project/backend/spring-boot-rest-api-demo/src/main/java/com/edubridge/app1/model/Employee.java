package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee23400")
public class Employee {
	@Id
	@GeneratedValue
private Integer employeeId;
private String employeeName;
private String employeeEmail;
private Double employeeSalary;
private long employeeMobile;
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public Double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(Double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public long getEmployeeMobile() {
	return employeeMobile;
}
public void setEmployeeMobile(long employeeMobile) {
	this.employeeMobile = employeeMobile;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer employeeId, String employeeName, String employeeEmail, Double employeeSalary,
		long employeeMobile) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeEmail = employeeEmail;
	this.employeeSalary = employeeSalary;
	this.employeeMobile = employeeMobile;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail=" + employeeEmail
			+ ", employeeSalary=" + employeeSalary + ", employeeMobile=" + employeeMobile + "]";
}

	
}
