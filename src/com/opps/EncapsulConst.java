package com.opps;

class Account {

	private String userName;
	private String password;
	private String name;
	private int age;
	private String city;
	private int pincode;

	public Account(String userName, String password, String name, int age, String city,int pincode) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.age = age;
		this.city = city;
		this.pincode=pincode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

public class EncapsulConst {
	public static void main(String[] args) {
		Account r = new Account("aadilnoor976", "A1243", "AADIL", 19, "SAKINAKA", 400072);
		System.out.println("USERNAME : " + r.getUserName());
		System.out.println("PASSWORD : " + r.getPassword());
		System.out.println("NAME : " + r.getName());
		System.out.println("AGE : " + r.getAge());
		System.out.println("CITY : " + r.getCity());
		System.out.println("PINCODE : "+r.getPincode());
		System.err.println("----------------------------------------------------------------");
		Account r1 = new Account("sameer123", "S1243", "SAMEER", 18, "SAKINAKA", 400072);
		System.out.println("USERNAME : " + r1.getUserName());
		System.out.println("PASSWORD : " + r1.getPassword());
		System.out.println("NAME : " + r1.getName());
		System.out.println("AGE : " + r1.getAge());
		System.out.println("CITY : " + r1.getCity());
		System.out.println("PINCODE : "+r1.getPincode());

	}
}
