package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

class Data {
	private int id;
	private String name;
	private String email;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}

public class Employee extends Data {
	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		Employee e = new Employee();
		e.setId(101);
		e.setName("AADIL");
		e.setEmail("aadil@123gmail.com");
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("SAM");
		e2.setEmail("Sam099@gmail.com");
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("FAIZ");
		e3.setEmail("faiz@223gmail.com");
		emp.add(e);
		emp.add(e2);
		emp.add(e3);

		for (Employee list : emp) {
			System.err.println("..........Employee List..........");
			System.out.println("Employee Id : " + list.getId());
			System.out.println("Employee Name : " + list.getName());
			System.out.println("Employee Email : " + list.getEmail());
		}

	}
}