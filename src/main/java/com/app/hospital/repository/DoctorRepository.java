package com.app.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hospital.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, String>{

}
