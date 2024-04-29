package com.test;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		super();
	}

	public Employee(int id) {
		super();
		System.out.println("int constructor invoked...!");
		this.id = id;
	}

	public Employee(String name) {
		super();
		System.out.println("String constructor invoked...!");
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		System.out.println("int string constructor invoked...!");
		this.id = id;
		this.name = name;
	}

	public Employee(String name, int id) {
		super();
		System.out.println("String int constructor invoked...!");
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println(id + " " + name);
	}
}
