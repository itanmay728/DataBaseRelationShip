package com.example.HospitalManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UsersDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String userName;
	private String password;
	private String role;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public UsersDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersDetails(Long id, String name, String userName, String password, String role, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "UsersDetails [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", role=" + role + ", employee=" + employee + "]";
	}
	
	
	
	
	
}
