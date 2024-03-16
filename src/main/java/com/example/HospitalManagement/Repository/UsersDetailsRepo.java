package com.example.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagement.model.UsersDetails;

public interface UsersDetailsRepo extends JpaRepository<UsersDetails, Long> {

}
