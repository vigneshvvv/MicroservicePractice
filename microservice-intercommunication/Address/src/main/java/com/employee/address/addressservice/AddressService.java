package com.employee.address.addressservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.address.addressentity.Addressentity;
import com.employee.address.addressrepo.AddressRepo;

@Component
public class AddressService {
	
	@Autowired
	AddressRepo addressRepo;
	
	public List<Addressentity> getall(){
		 
		return addressRepo.findAll();
	}

}
