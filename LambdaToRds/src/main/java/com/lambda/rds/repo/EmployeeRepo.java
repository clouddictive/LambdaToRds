package com.lambda.rds.repo;

import com.lambda.rds.model.Employee;

public interface EmployeeRepo {
	Employee getEmployee(int id);
}
