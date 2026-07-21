package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;
@Service
public class IStudentServiceManagement implements IStudentService {
	@Autowired
    private StudentRepository repo;
	
	@Override
	public String addStudent(Student student) {
		int id= repo.save(student).getId();
		return "Student is saved with id: "+id;
	}

	@Override
	public Student getStudent(int id) {
		Optional<Student> s = repo.findById(id);
		return s.get();
	}

	@Override
	public void showAllStudent() {
		
		List<Student> s = repo.findAll();
		s.stream().forEach(System.out::println);

	}

}
