package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {

	public static void main(String[] args) {
		Address address = new Address(1, "Road-15", "Mumbai", "Maharashtra");
		Employee employee = new Employee(1, "Shashank", 1000, address);
		// Employee employee = new Employee(1, "Shashank", 1000, new Address(1,
		// "Road-15", "Mumbai", "Maharashtra"));
		System.out.println(employee);
	}

}
