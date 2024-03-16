package com.example.HospitalManagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.HospitalManagement.Repository.EmployeeRepository;
import com.example.HospitalManagement.Repository.UsersDetailsRepo;
import com.example.HospitalManagement.model.Employee;
import com.example.HospitalManagement.model.UsersDetails;
import com.example.HospitalManagement.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private UsersDetailsRepo usersDetailsRepo;
	
	@GetMapping("/employee")
	public String getaddEmployee() {
		return "addEmployee";
	}
	
	@PostMapping("/Save")
	public String saveEmployee(@ModelAttribute Employee employee ) {
		
		employeeService.saveEmployeeDetails(employee);
		return "redirect:/employee";
	}
	
	
	
	@GetMapping("/test")
	public String test(Model model) {
		
		//Employee employee = employeeRepository.findById(1L).get();
		//System.out.println(employee.getUsersDetails().getName());
		
	   // employeeRepository.deleteById(1L);
		
		//UsersDetails usersDetail = employee.getUsersDetails();
		//model.addAttribute("Users",usersDetail);
		
		//UsersDetails usersDetails = usersDetailsRepo.findById(2L).get();
		//System.out.println(usersDetails.getEmployee().getPhoneNumber());
		//Employee employe = usersDetails.getEmployee();
		
		//model.addAttribute("employe",employe);
		
		Employee employee = employeeRepository.findById(3L).get();
		
		
		String a = "Caller";
		employee.setRole(a);
		
		employee.getUsersDetails().setRole(a);
	
		employeeRepository.save(employee);
		
		
		return "test";
	}
}
