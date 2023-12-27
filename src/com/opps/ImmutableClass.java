package com.opps;

public final class ImmutableClass {
	private final int id;
	private final String name;

	public ImmutableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private void display() {
		System.out.println("ID : " + id + "\nNAME : " + name);
	}

	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass(101, "AADIL");
		immutableClass.display();

	}
}
