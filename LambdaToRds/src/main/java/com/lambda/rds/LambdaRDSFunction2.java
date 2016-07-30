package com.lambda.rds;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.lambda.rds.model.Employee;
import com.lambda.rds.service.EmployeeService;

public class LambdaRDSFunction2 implements RequestHandler<String, Employee> {

	public Employee handleRequest(String employeeId, Context context) {
		
		String time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	    
		context.getLogger().log("Lambda RDS Calls started: " + time);
		
	    context.getLogger().log("Employee ID:" + employeeId);
	    
	    //Load Spring
	    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {
	            "classpath*:META-INF/spring/app-context.xml"
	            });
	    
	    //Get employee Service bean
		 EmployeeService empService = (EmployeeService) ac.getBean("employeeService");
		 
		 //Make call to RDS
		 Employee emp =empService.getEmployeeObject(Integer.parseInt(employeeId));
		 
		context.getLogger().log("Employee : " + emp.toString());
		 
	    time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	    
	    context.getLogger().log("Lambda function completed: " + time);
		
	    return emp;
	}
}