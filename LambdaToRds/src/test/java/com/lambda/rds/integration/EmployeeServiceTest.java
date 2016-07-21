package com.lambda.rds.integration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lambda.rds.service.EmployeeService;


public class EmployeeServiceTest {
	ApplicationContext ac = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext(new String[] {
	            "classpath*:META-INF/spring/app-context.xml"
	            });
	}

	@Test
	public void testGetEmployee() {
		
		 EmployeeService empService = (EmployeeService) ac.getBean("employeeService");
		 String emp =empService.getEmployee(1);
		 assertNotNull(emp);
	}

}
