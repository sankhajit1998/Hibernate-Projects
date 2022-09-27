package com.maven.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class EmployeeDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(length = 20, nullable = false)
	@NotNull(message = "Please enter name!")
	private String ename;
	
	@Column(length = 20, nullable = false, unique = true)
	@NotNull(message = "Please enter phone no!")
	private long ephone;
	
	@Column(length = 20, nullable = false)
	@NotNull(message = "Please enter salary!")
	private double esalary;
	
	@Column(length = 50)
	@NotNull(message = "Please enter addr!")
	private String addr;
	
	@Column(length = 20, nullable = false, unique = true)
	@NotNull(message = "Please enter email!")
	@Email(message = "Please enter proper email id")
	private long email;
}
