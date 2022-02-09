package com.springboot.EmpApp.service;

import java.util.Map;

import com.springboot.EmpApp.entity.Employee;

public interface EmployeeService {

	//get all employee
	public Map<Integer,Employee> getAllEmployee();
	
	//get employee by id
	public Employee getEmployeeById(int id);
	
	//add employee
	public String addEmployee(Employee emp);
	
	//update employee
	public String updateEmployee(Employee empUpdate);
	
	//delete employee
	public String deleteEmployee(int id);
}
