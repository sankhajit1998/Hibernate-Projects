package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employees {
	
	@Id
	private String efname;
	
	@Column(length = 20,nullable = false)
	private String elname;
	
	@Column(length = 11,nullable = false, unique = true)
	private long ephone;
	
	@Column(length = 25,nullable = false, unique = true)
	private String email;
	
	@Column(length = 10,nullable = false)
	private double salary;
	
	@Column(length = 20,nullable = false)
	private String eaddress;
	
}
