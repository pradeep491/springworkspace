package com.test;

public class Employee {
	private int empid;
	private String empName;
	private Address address;

	public Employee(int empid, String empName, Address address) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.address = address;
	}

	public void show() {
		System.out.println(empid + " " + empName);
		System.out.println(address);
	}
}
