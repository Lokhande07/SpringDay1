package com.mindgate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.rowmapper.EmployeeRowMapper;

@Repository("employeeDAO")
@Scope("prototype")
public class EmployeeDAO implements EmployeeDAOInterface {

	private JdbcTemplate jdbcTemplate;
	private int resultCount;

	private static final String INSERT_EMPLOYEE = "Insert into employee_details(name,salary) Values(?,?)";
	private static final String SELECT_ALL_EMPLOYEE = "Select * from employee_details";
	private static final String SELECT_SINGLE_EMPLOYEE = "Select * from employee_details where employee_id=?";

	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("Inserting New Employee Into DataBase");
		System.out.println(employee);

		Object[] args = { employee.getName(), employee.getSalary() };
		resultCount = jdbcTemplate.update(INSERT_EMPLOYEE, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = jdbcTemplate.query(SELECT_ALL_EMPLOYEE, new EmployeeRowMapper());
		return allEmployees;
	}

	@Override
	public Employee getEmployeeByEmployee(int employeeId) {
		Object[] args = { employeeId };
		Employee employee = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE, args, new EmployeeRowMapper());
		return employee;
	}

}
