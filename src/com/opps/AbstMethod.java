package com.opps;

abstract class Course {
	public void CourseDetail() {
		System.out.println("...COURSE NAME BCA...");
		System.out.println("...COURSE DURATION 2023 - 2025...");
		
	}
	abstract int StudentData();
}

class Student5 {
	int rollno;
	String name;
	String courseName;

	public Student5(int rollno, String name, String courseName) {
		this.rollno = rollno;
		this.name = name;
		this.courseName = courseName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}

class StudentRecord extends Course {

	@Override
	public int StudentData() {
		Student5 r = new Student5(10, "AADIL", "BCA");

		System.out.println("STUDENT ROLL NO : " + r.getRollno());
		System.out.println("STUDENT NAME : " + r.getName());
		System.out.println("STUDENT COURSE NAME : " + r.getCourseName());
		return 0;
	}
}

class HostelRecord extends Course {

	@Override
	public int StudentData() {
		Student5 r = new Student5(11, "SAMEER", "BCA");
		System.out.println("STUDENT ROLL NO : " + r.getRollno());
		System.out.println("STUDENT NAME : " + r.getName());
		System.out.println("STUDENT COURSE NAME : " + r.getCourseName());

		return 0;
	}

}

public class AbstMethod {
	public static void main(String[] args) {
		StudentRecord s = new StudentRecord();
		HostelRecord h = new HostelRecord();
		s.CourseDetail();
		System.err.println("------------------------------------");
		s.StudentData();
		System.err.println("------------------------------------");
		h.StudentData();
	}

}
