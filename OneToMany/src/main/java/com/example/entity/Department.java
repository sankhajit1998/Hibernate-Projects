package com.example.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	@Column(length = 20,nullable = false)
	private String dname;
	
	@Column(length = 20,nullable = false)
	private String dhead;
	
	@Column(length = 10,nullable = false)
	private String dzone;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="did")
	private List<Employees> employees;
}
