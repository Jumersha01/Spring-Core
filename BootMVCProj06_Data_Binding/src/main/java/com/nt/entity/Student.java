package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Student_form_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
 @Id	
 private Integer id;
 
 @NonNull
 private String name;
 
 @NonNull
 private String college;
 
 @NonNull
 @Column(name="class")
 private String cls;
 
 @NonNull
 @Column(name="Address")
 private String add="Hydrabad";
 
 @Override
 public String toString() {
	 return "Student Name: "+this.getName()+"\nStudent Id: "+this.getId()+"\nStudent Collenge: "+this.getCollege()+"\nStudent Class: "+this.getCls()+"\nStudent Address:"+this.getAdd();
 }
 
}
