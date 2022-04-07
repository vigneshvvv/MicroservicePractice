package com.employee.address.addressentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "address")

public class Addressentity {
	
	@Override
	public String toString() {
		return "Addressentity [id=" + id + ", doorno=" + doorno + ", street=" + street + ", city=" + city + "]";
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	private String doorno;
	private String street;
	private String city;
	
	
	public Addressentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addressentity(Integer id, String doorno, String street, String city) {
		super();
		this.id = id;
		this.doorno = doorno;
		this.street = street;
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
