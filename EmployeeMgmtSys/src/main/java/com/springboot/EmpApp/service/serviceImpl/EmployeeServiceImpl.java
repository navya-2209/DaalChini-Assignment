package com.springboot.EmpApp.service.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.springboot.EmpApp.entity.Employee;
import com.springboot.EmpApp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
	public Map<Integer,Employee> getAllEmployee() {
		// get all the employees
		
		return empMap;
	}

	public String addEmployee(Employee emp) {
		// add new employee
		empMap.put(emp.getEmpId(),emp);
		return "Employee Added Successfully";
	}

	public String updateEmployee(Employee empUpdate) {
		// update existing employee
		if(empMap.containsKey(empUpdate.getEmpId())){
			empMap.put(empUpdate.getEmpId(), empUpdate);
			return "Employee Update Success";
		}
		else
		   return "Employee does not exist";
	}

	public String deleteEmployee(int id) {
		// delete a employee record
		if(empMap.containsKey(id)) {
			empMap.remove(id);
			return "Deletion success";
		}
		else
		    return "Employee Not Found";
	}

	@Override
	public Employee getEmployeeById(int id) {
		// get employee by id
		for(Map.Entry<Integer,Employee> map : empMap.entrySet()) {
			if(map.getKey()==id) {
				return map.getValue();
				
			}
		}
		return null;
	}

	

}
