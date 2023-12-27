package com.oops;

public class Employee {
	String name;
	int emp_id;
	int age;
	long ph_no;

	Employee(String name, int emp_id, int age, long ph_no) {
		this.name = name;
		this.emp_id = emp_id;
		this.age = age;
		this.ph_no = ph_no;
		System.out.println("name- " + name + " \n id-" + emp_id + " \n age-" + age + "\n phone-" + ph_no);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Aadil", 101, 19, 9517058289L);
		System.out.println("-----------------------");
		Employee e2 = new Employee("Arhan", 102, 18, 8591761957L);
		System.out.println("-----------------------");
		Employee e3 = new Employee("sameer", 103, 19, 8828456078L);
		System.out.println("-----------------------");
		Employee e4 = new Employee("Iliyas", 104, 21, 8310547006L);
		System.out.println("-----------------------");
		Employee e5 = new Employee("abrar", 105, 20, 6390993014L);

	}

}
