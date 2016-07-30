package com.lambda.rds.service;

import com.lambda.rds.model.Employee;

public interface EmployeeService {
	String getEmployee(int id);
	Employee getEmployeeObject(int id);
}
