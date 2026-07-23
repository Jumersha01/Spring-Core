package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Employees_Details")
public class Employee {

	@Column(name="Emp_Id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	@Column(name="Emp_Name",length=30)
	String name;
	
	@Column(name="Emp_Sal")
	double sal;
	
	@Column(name="Emp_Addr",length=30)
	String addr;
	
	

}
