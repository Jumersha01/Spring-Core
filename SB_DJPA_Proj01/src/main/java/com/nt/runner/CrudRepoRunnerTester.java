package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeServiceImp;

@Component
public class CrudRepoRunnerTester implements CommandLineRunner {

	@Autowired
	private IEmployeeServiceImp impService;
	
	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		
		emp.setName("Abul Hamid");
		emp.setAddr("Delhi");
		emp.setSal(90000);
		
		String msg = impService.registerEmployee(emp);
		System.out.println(msg);
		
	}

}
