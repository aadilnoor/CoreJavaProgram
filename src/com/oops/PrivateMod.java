package com.oops;

class Mod {
	private String name = "Aadil";
	private int id = 1001;
	private float salary = 30000f;

	public void show(int a) {
		System.out.println("Name:-" + name + "\nId:-" + id + "\nSalary:-" + salary);
	}
}

public class PrivateMod {
	public static void main(String[] args) {
		Mod obj = new Mod();
		obj.show(10);
	}

}
