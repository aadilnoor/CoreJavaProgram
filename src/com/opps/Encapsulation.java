package com.opps;

class Student2 {
	private int rollno;
	private String name;
	private String className;

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public void setRollno(int Rollno) {
		rollno = Rollno;
	}

	public void setName(String Name) {
		name = Name;
	}

	public void setclassName(String ClassName) {
		className = ClassName;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Student2 r = new Student2();
		r.setRollno(10);
		r.setName("AADIL");
		r.setclassName("BCA");
		System.out.println("Student Rollno : " + r.getRollno());
		System.out.println("Student Name : " + r.getName());
		System.out.println("Student Class Name : " + r.getClassName());
	}
}
