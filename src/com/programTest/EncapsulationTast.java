package com.programTest;

class Employee {
	private int id;
	private String name;
	private int age;
	private long phoneNo;

	public Employee(int id, String name, int age, long phoneNo) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}

public class EncapsulationTast {
	public static void main(String[] args) {
		Employee e = new Employee(101, "AADIL", 20, 8976457876L);
		int id = e.getId();
		String name = e.getName();
		int age = e.getAge();
		long phoneNumber = e.getPhoneNo();
		System.out.println("Employee id : " + id + "\nEmployee name : " + name + "\nEmployee age : " + age
				+ "\nEmployee phoneNumber : " + phoneNumber);
	}

}
