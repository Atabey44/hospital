package com.app.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
	
	private String name;
	private NamePrefix namePrefix;
	private Department department;
	private Integer dateOfGraduate;
	private Integer dateOfStart;

}
