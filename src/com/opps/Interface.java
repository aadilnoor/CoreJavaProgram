package com.opps;

interface Student {

	int rollNo = 1; /* public static final */
	int marks = 79;

	void showData(); /* public abstract */

	void showDetails();

}

public class Interface implements Student {

	@Override
	public void showData() {
		System.out.println("...student data...");

	}

	@Override
	public void showDetails() {
		System.out.println("Student rollno.." + rollNo + "\nStudent marks.." + marks);

	}

	public static void main(String[] args) {
		Interface ob = new Interface();
		ob.showData();
		ob.showDetails();
	}

}
