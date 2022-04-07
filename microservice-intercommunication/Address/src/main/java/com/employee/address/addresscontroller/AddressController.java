package com.employee.address.addresscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.employee.address.addressentity.Addressentity;
import com.employee.address.addressservice.AddressService;

@CrossOrigin
@RestController
@RequestMapping("add")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	Feignconfig feignconfig;
	
//	@GetMapping("/alladdress")
//	public List<Addressentity> getalladdress(){
//		return addressService.getall();
//		
//	}
	
	@GetMapping("/alladdress")
	public String getalladdress(){
		return "HelloWorld";
		
	}
	
	@GetMapping("feignemployee")
	public List<EmployeDto> getfeignemployee(){
		return feignconfig.getemployeefeign();
	}

}
