package com.otm.entity;
/*
@Author Sankajit Roy
*/
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

// Entity class
public class University {
	
	// taking variables of entities
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@Column(length = 20,nullable = false)
	private String uname;
	
	@Column(length = 20,nullable = false)
	private String uhead;
	
	@Column(length = 10,nullable = false)
	private String uzone;
	
	// created One To Many relationship and join the columns
	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Student> student;
	
}
