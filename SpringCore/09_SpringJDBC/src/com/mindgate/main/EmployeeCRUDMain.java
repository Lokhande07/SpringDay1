package com.mindgate.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Raj", 1000);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Employee added Successfully");
//		} else {
//			System.out.println("Employee Fail to Add");
//		}
//		

		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
		for (Employee employee2 : allEmployees) {
			System.out.println(employee2);
		}

		System.out.println("-".repeat(100));
		try {
			Employee emp = employeeServiceInterface.getEmployeeByEmployee(5);
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		
	}

}
