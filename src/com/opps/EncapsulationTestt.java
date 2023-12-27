package com.opps;

class Std {
	private int roll_no;
	private String name;
	private String city;

	Std(int roll_no, String name, String city) {
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class EncapsulationTestt {
	public static void main(String[] args) {
		Std ob = new Std(12345, "papa", "Mumbai");
		System.out
				.println("Roll Number : " + ob.getRoll_no() + "\nName : " + ob.getName() + "\nCity : " + ob.getCity());
	}

}
