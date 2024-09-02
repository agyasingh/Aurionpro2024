package com.aurionpro.jpacrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@ToString
public class Student {
	
	
	@Column(name="rollnumber")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollnumber;
	
	@NotNull(message="name must not be null")
	@Column(name="name")
	private String name;
	
	@Min(18)
	@Column(name="age")
	private int age;
	
	
	//lombok dependency->annotations>>getters setters and constructors
	

}
