package com.assosiation;

class Vehicle {
	String color;
	float height;
	String model;
	String wheelar;

	public Vehicle(String color, float height, String model, String wheelar) {
		this.color = color;
		this.height = height;
		this.model = model;
		this.wheelar = wheelar;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setWheelar(String wheelar) {
		this.wheelar = wheelar;
	}

	public String getWheelar() {
		return wheelar;
	}

}
