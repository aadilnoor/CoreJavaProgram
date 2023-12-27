package com.opps;

class Employeee {
	private String name;
	private String empid;
	private String department;
	private int age;
	private long number;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class Encapsulation3 {
	public static void main(String[] args) {
		Employeee r = new Employeee();
		r.setName("AADIL");
		r.setEmpid("AA1243");
		r.setDepartment("MANAGER");
		r.setAge(19);
		r.setCity("MUMBAI");
		r.setNumber(9517058289L);

		Employeee r1 = new Employeee();
		r1.setName("SAMEER");
		r1.setEmpid("SM1243");
		r1.setDepartment("IT");
		r1.setAge(20);
		r1.setCity("MUMBAI");
		r1.setNumber(8828456078L);

		System.out.println(".....FIRST EMPLOYEE.....");

		System.out.println("EMPLOYEE NAME : " + r.getName());
		System.out.println("EMPLOYEE ID : " + r.getEmpid());
		System.out.println("EMPLOYEE DEPARTMENT : " + r.getDepartment());
		System.out.println("EMPLOYEE AGE : " + r.getAge());
		System.out.println("EMPLOYEE CITY : " + r.getCity());
		System.out.println("EMPLOYEE NUMBER : " + r.getNumber());

		System.err.println(".....SECOND EMPLOYEE.....");
		System.err.println("EMPLOYEE NAME : " + r1.getName());
		System.err.println("EMPLOYEE ID : " + r1.getEmpid());
		System.err.println("EMPLOYEE DEPARTMENT : " + r1.getDepartment());
		System.err.println("EMPLOYEE AGE : " + r1.getAge());
		System.err.println("EMPLOYEE CITY : " + r1.getCity());
		System.err.println("EMPLOYEE NUMBER : " + r1.getNumber());

	}
}
