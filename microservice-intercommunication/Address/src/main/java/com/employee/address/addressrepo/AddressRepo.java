package com.employee.address.addressrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.address.addressentity.Addressentity;

public interface AddressRepo extends JpaRepository<Addressentity,Integer> {

}
