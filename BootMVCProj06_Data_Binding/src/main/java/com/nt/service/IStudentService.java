package com.nt.service;

import com.nt.entity.Student;

public interface IStudentService {
	
  String addStudent(Student student);
  
  Student getStudent(int id);
  
  void showAllStudent();
}
