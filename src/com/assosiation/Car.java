package com.assosiation;

public class Car {
	Vehicle vehicle;
	String name;
	String feature;
	long price;
	int airbags;

	public Car(Vehicle vehicle, String name, String feature, long price, int airbags) {
		this.vehicle = vehicle;
		this.name = name;
		this.feature = feature;
		this.price = price;
		this.airbags = airbags;
	}

	void Display() {
		System.out.println("VEHICLE NAME : " + name + "\n VEHICLE FEATURE : " + feature + "\n VEHICLE PRICE : " + price
				+ "\n VEHICLE AIRBAGS : " + airbags);
		System.out.println("VEHICLE COLOR : " + vehicle.getColor() + "\n VEHICLE HEIGHT : " + vehicle.getHeight()
				+ "\nVEHICLE MODEL : " + vehicle.getModel() + "\n VEHICLE WHEELAR : " + vehicle.getWheelar());

	}

}

class FinalClass {
	public static void main(String[] args) {

		Vehicle ob2 = new Vehicle("BLACK", 2.2F, "2023", "4 WHEELAR");
		Car ob1 = new Car(ob2, "BMW", "ADVANCED", 20000000L, 2);

		ob1.Display();

	}
}