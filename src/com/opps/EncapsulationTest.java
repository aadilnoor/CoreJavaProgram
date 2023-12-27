package com.opps;

class StudentData {
	private int id;
	private String name;
	private long mo_number;
	private int age;
	private int salary;

	StudentData(int id, String name, long mo_number, int salary, int age) {
		this.id = id;
		this.name = name;
		this.mo_number = mo_number;
		this.salary = salary;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMo_Number(long mo_number) {
		this.mo_number = mo_number;
	}

	public long getMo_Number() {
		return mo_number;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public int Display() {
		System.out.println("STUDENT ID : " + getId() + "\nSTUDENT NAME : " + getName() + "\nSTUDENT NUMBER : "
				+ getMo_Number() + "\nSTUDENT SALARY : " + getSalary() + "\nSTUDENT AGE : " + getAge());
		return 0;
	}
}

public class EncapsulationTest {
	public static void main(String[] args) {
		StudentData sd = new StudentData(111, "AADIL", 9517058289L, 100000, 19);
		sd.Display();
		System.err.println("----------------------------------------------------");
		StudentData sd1 = new StudentData(112, "SAMEER", 9373783373L, 1200000, 18);
		sd1.Display();
	}
}
