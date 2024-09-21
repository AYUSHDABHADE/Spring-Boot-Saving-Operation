package com.velocity.student;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String saleary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSaleary() {
		return saleary;
	}

	public void setSaleary(String saleary) {
		this.saleary = saleary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", saleary=" + saleary + "]";
	}

	public Employee(int id, String name, String address, String saleary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.saleary = saleary;
	}

	

}
