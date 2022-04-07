package com.employee.details.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.details.Entity.EmployeeEntity;



public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
