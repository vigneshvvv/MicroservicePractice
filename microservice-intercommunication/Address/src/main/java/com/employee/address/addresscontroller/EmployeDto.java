package com.employee.address.addresscontroller;



public class EmployeDto {
	
	private Integer id;
	private String name;
	
	public EmployeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeDto(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeDto [id=" + id + ", name=" + name + "]";
	}
	
	

}
