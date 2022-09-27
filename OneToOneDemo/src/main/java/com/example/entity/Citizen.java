package com.example.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
//entity class
public class Citizen {
	
	// taking variables
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(length = 20, nullable = false)
	private String cname;
	
	@Column(length = 20, nullable = false)
	private String surname;
	
	@Column(length = 15, nullable = false, unique = true)
	private long phone;
	
	@Column(length = 30, nullable = false, unique = true)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String dob;
	// set one to one relation annotation
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;    // aggregation
}
