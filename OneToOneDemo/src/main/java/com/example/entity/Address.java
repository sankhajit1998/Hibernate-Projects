package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
// entity class
public class Address {

	// taking variables
	@Id
	private long idnumber;
	@Column(length = 20,nullable = false)
	private String idtype;
	@Column(length = 20,nullable = false)
	private String address;
	@Column(length = 20,nullable = false)
	private String city;
	@Column(length = 20,nullable = false)
	private String state;
	@Column(length = 20,nullable = false)
	private int pin;
	// set one to one relation annotation
	@OneToOne(targetEntity = Citizen.class)
	private Citizen citizen;
}