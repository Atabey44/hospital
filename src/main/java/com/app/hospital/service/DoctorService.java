package com.app.hospital.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.hospital.dto.CreateDoctorDTO;
import com.app.hospital.dto.DoctorDTO;
import com.app.hospital.dto.DoctorDTOConvert;
import com.app.hospital.model.Doctor;
import com.app.hospital.repository.DoctorRepository;

@Service
public class DoctorService {

	private DoctorRepository doctorRepository;
	private DoctorDTOConvert doctorDTOConvert;
	
	public DoctorService(DoctorDTOConvert doctorDTOConvert) {
		super();
		this.doctorDTOConvert = doctorDTOConvert;
	}

	public List<DoctorDTO> getAllDoctors() {
		List<Doctor> doctorList = doctorRepository.findAll();
		List<DoctorDTO> doctorDTOList= new ArrayList<>();
		for (Doctor doctor : doctorList) {
			doctorDTOList.add(doctorDTOConvert.convert(doctor));
		}
		return doctorDTOList;
	}

	public DoctorDTO getOneDoctor(String id) {
		Optional<Doctor> doctorOptional = doctorRepository.findById(id);
		return doctorOptional.map(doctorDTOConvert::convert).orElse(new DoctorDTO());
			}

	public DoctorDTO addDoctor(CreateDoctorDTO createDoctorDTO) {
		Doctor doctor = new Doctor();
		doctor.setId(createDoctorDTO.getId());
		doctor.setName(createDoctorDTO.getName());
		doctor.setNamePrefix(createDoctorDTO.getNamePrefix());
		doctor.setDepartment(createDoctorDTO.getDepartment());
		doctor.setDateOfStart(createDoctorDTO.getDateOfGraduate());
		doctor.setDateOfGraduate(createDoctorDTO.getDateOfGraduate());
		doctorRepository.save(doctor);
		return doctorDTOConvert.convert(doctor);
	}
	
	

	
	
}
