package com.aurionpro.jpacrud.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="course")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
	
	@Column(name="courseId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="fees")
	private double fees;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	@JoinColumn(name="instructorId")
	private Instructor instructor;
	

}
