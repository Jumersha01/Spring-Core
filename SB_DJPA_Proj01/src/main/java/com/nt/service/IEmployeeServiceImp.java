package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class IEmployeeServiceImp implements IEmployeeService {

	@Autowired
	 private IEmployeeRepository empRepo;
	
	@Override
	public String registerEmployee(Employee emp) {
		System.out.println("Employee id befor save: "+emp.getId());
		Employee emply = empRepo.save(emp);
		
		return "Employee object is saved with Id: "+emply.getId();
	}

}
