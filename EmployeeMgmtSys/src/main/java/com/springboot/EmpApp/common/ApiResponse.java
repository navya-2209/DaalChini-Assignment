package com.springboot.EmpApp.common;

import org.springframework.http.HttpStatus;

public class ApiResponse {

	private String message;
	private HttpStatus status;
	private boolean error;
	private Object body;
    private boolean success;
    
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public Object getBody() {
		return body;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void setBody(Object body) {
		// TODO Auto-generated method stub
		this.body=body;
		
	}	
	
}
