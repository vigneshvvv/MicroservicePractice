package com.employee.address.addresscontroller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "employee")
public interface Feignconfig {

	@GetMapping("/employee/emp/allemployee")
	public List<EmployeDto> getemployeefeign();
}
