package com.app.hospital.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.app.hospital.dto.Department;
import com.app.hospital.dto.NamePrefix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

		@Id
		private String	id;
		private String name;
		
		@Enumerated(EnumType.STRING)
		private NamePrefix namePrefix;
		
		@Enumerated(EnumType.STRING)
		private Department department;
		
		private Integer dateOfGraduate;
		private Integer dateOfStart;
		
}