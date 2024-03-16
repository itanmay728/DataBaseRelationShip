package com.example.HospitalManagement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String userName;
	private String phoneNumber;
	private String address;
	private String panNumber;
	private String aadhaar;
	private String bankHolderName;
	private String accountNumber;
	private String ifscCode;
	private String role;
	
	@OneToOne(mappedBy = "employee" , cascade = CascadeType.ALL)
	private UsersDetails usersDetails;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getBankHolderName() {
		return bankHolderName;
	}

	public void setBankHolderName(String bankHolderName) {
		this.bankHolderName = bankHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UsersDetails getUsersDetails() {
		return usersDetails;
	}

	public void setUsersDetails(UsersDetails usersDetails) {
		this.usersDetails = usersDetails;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String userName, String phoneNumber, String address, String panNumber,
			String aadhaar, String bankHolderName, String accountNumber, String ifscCode, String role,
			UsersDetails usersDetails) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.panNumber = panNumber;
		this.aadhaar = aadhaar;
		this.bankHolderName = bankHolderName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.role = role;
		this.usersDetails = usersDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", userName=" + userName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", panNumber=" + panNumber + ", aadhaar=" + aadhaar + ", bankHolderName="
				+ bankHolderName + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", role=" + role
				+ ", usersDetails=" + usersDetails + "]";
	}
	
	
	
	
}
