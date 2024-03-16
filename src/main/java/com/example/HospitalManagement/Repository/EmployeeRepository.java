package com.example.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
