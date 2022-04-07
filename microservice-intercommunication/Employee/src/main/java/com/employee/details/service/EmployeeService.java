package com.employee.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.employee.details.Entity.EmployeeEntity;
import com.employee.details.Repo.EmployeeRepo;



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<EmployeeEntity> getallemployee()
	
	{
		return employeeRepo.findAll();
		
	}

}
