package com.aurionpro.jpacrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDto {
	private int instructorId;
private String instructorName;
private String email;
private String qualification;
}
