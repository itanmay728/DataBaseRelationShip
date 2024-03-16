package com.example.HospitalManagement.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalManagement.Repository.EmployeeRepository;
import com.example.HospitalManagement.model.Employee;
import com.example.HospitalManagement.model.UsersDetails;
import com.example.HospitalManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		
		
		
		UsersDetails usersDetails = new UsersDetails();
		
		usersDetails.setName(employee.getName());	
		usersDetails.setUserName(employee.getUserName());
		usersDetails.setPassword("123");
		usersDetails.setRole(employee.getRole());
		usersDetails.setEmployee(employee);
		
	
		employee.setUsersDetails(usersDetails);
		employeeRepository.save(employee);
		return null;
	}

}
