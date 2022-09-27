package com.maven.entity;
/*
@Author Sankhajit Roy
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Table(name = "empdeatils")
@Entity
@Getter
@Setter
// entity class
public class Employee {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO)   // auto increment
	private int eid;
	
	@Column(length = 20, nullable = false)
	private String ename;
	
	@Column(length = 20, nullable = false, unique = true)
	private long ephone;
	
	@Column(length = 20, nullable = false)
	private double esalary;
	
	@Column(length = 50)
	private String addr;
	
	@Column(length = 20, nullable = false, unique = true)
	private String email;
	
}
