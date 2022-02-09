package com.springboot.EmpApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.EmpApp.entity.Employee;
import com.springboot.EmpApp.common.ApiResponse;
import com.springboot.EmpApp.service.EmployeeService;

@RestController
public class AppController {
	
	@Autowired 
	EmployeeService empService;
	
	@GetMapping("getEmployee")
	public ResponseEntity<ApiResponse> getEmployeeMap(){
		ApiResponse response = new ApiResponse();
		response.setBody(empService.getAllEmployee());
		response.setMessage("Retrieval Success");
		response.setError(false);
		response.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("getEmployee/{empId}")
	public ResponseEntity<ApiResponse> getEmployeeById(@PathVariable("empId") int id){
		ApiResponse response = new ApiResponse();
		response.setBody(empService.getEmployeeById(id));
		response.setMessage("Retrieval Success");
		response.setError(false);
		response.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
		
	@PostMapping("addEmployee")
	public ResponseEntity<ApiResponse> addEmployeeDetails (@RequestBody Employee employee){
		ApiResponse response = new ApiResponse();
		response.setBody(empService.addEmployee(employee));
		response.setMessage("Retrieval Success");
		response.setError(false);
		response.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PutMapping("updateEmployee")
	public ResponseEntity<ApiResponse> updateEmployee(@RequestBody Employee employee){
		ApiResponse response = new ApiResponse();
		response.setBody(empService.updateEmployee(employee));
		response.setMessage("Retrieval Success");
		response.setError(false);
		response.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
		
	@DeleteMapping("deleteEmployee/{empId}")
	public ResponseEntity<ApiResponse> deleteEmpById(@PathVariable("empId") int id) {
		ApiResponse response = new ApiResponse();
		response.setBody(empService.deleteEmployee(id));
		response.setMessage("Retrieval Success");
		response.setError(false);
		response.setStatus(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
		
	}

