package com.app.hospital.dto;

import org.springframework.stereotype.Component;

import com.app.hospital.model.Doctor;

@Component
public class DoctorDTOConvert {

	public DoctorDTO convert (Doctor doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setName(doctor.getName());
		doctorDTO.setNamePrefix(doctor.getNamePrefix());
		doctorDTO.setDepartment(doctor.getDepartment());
		doctorDTO.setDateOfGraduate(doctor.getDateOfGraduate());
		doctorDTO.setDateOfStart(doctor.getDateOfGraduate());
		
		return doctorDTO;
	}
}
