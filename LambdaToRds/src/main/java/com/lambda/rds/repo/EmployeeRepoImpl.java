package com.lambda.rds.repo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lambda.rds.model.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	DataSource dataSource;
	
	public Employee getEmployee(int id) {
		String query ="Select * from Employee where id=" + id;
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Employee> emp = null;
		
		try {
			emp = jdbcTemplate.query(query,new BeanPropertyRowMapper<Employee>(Employee.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
		if(emp!=null && emp.size() > 0){
			return emp.get(0);
		}
		
		return null;
	}

}
