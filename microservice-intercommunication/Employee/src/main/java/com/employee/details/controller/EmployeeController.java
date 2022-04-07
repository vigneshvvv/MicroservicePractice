package com.employee.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.details.Entity.EmployeeEntity;
import com.employee.details.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("emp")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@GetMapping( "allemployee")
	public List<EmployeeEntity> findalluser(){
		return employeeService.getallemployee();
		
	}

}
