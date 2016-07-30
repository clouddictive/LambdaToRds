package com.lambda.rds.service;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.lambda.rds.model.Employee;
import com.lambda.rds.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	
	public String getEmployee(int id) {
		String json = null;
		
		Employee emp = employeeRepo.getEmployee(id);
		
	    if(emp!=null){
	    	
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			
			 try {
				json = ow.writeValueAsString(emp);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
		return json;
	}

	@Override
	public Employee getEmployeeObject(int id) {
		return employeeRepo.getEmployee(id);
	}

}
