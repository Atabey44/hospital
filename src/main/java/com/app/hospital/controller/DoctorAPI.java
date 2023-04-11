package com.app.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.hospital.dto.CreateDoctorDTO;
import com.app.hospital.dto.DoctorDTO;
import com.app.hospital.service.DoctorService;

@RestController
@RequestMapping("v1/doctor")
public class DoctorAPI {

	private DoctorService doctorService;

	public DoctorAPI(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<DoctorDTO>> getAllDoctors(){
		return ResponseEntity.ok(doctorService.getAllDoctors());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DoctorDTO> getOneDoctor(@RequestParam String id) {
		return ResponseEntity.ok(doctorService.getOneDoctor(id));
	}
	
	@PostMapping("/addDoctor")
	public ResponseEntity<DoctorDTO> addDoctor(@RequestBody CreateDoctorDTO createDoctorDTO) {
		return ResponseEntity.ok(doctorService.addDoctor(createDoctorDTO));
	}
	
}
