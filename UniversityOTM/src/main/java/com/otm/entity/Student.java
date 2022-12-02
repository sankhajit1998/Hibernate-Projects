package com.otm.entity;
/*
@Author Sankajit Roy
*/


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity


// Entity class
public class Student {
	
	// taking variables of entities
	@Id
	private String sname;
	
	@Column(length = 11,nullable = false, unique = true)
	private long sphone;
	
	@Column(length = 20,nullable = false)
	private String sdept;
	
	@Column(length = 25,nullable = false, unique = true)
	private String semail;
	
	@Column(length = 20,nullable = false)
	private String saddress;

}
