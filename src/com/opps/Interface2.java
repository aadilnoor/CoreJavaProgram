package com.opps;
interface NewCarModel {
	public void isAutomatic();
	public void modelName();
	public void highTechAC();
}
class FirstPlant implements NewCarModel {
	Car car = new Car("BMW", true, "X5.0", 5.1f, "White", "Petrol", "260bhp", 5);
	public void CarFeatures() {
		System.out.println("Brand Name : " + car.getCompany());
		System.out.println("Color of Car : " + car.getColor());
		System.out.println("Power : " + car.getPower());
		System.out.println("Fuel type : " + car.getFuelType());
		System.out.println("No of Gears: " + car.getNumberOfGear());
	}
	@Override
	public void isAutomatic() {
		System.out.println("Is this Car automatic : " + car.isAutomatic());
	}
	@Override
	public void modelName() {
		System.out.println("Model name : " + car.getModelName());
	}
	@Override
	public void highTechAC() {
		System.out.println("Model name : " + car.getHighTechAC());
	}
}
class SecondPlant implements NewCarModel {
	Car car = new Car("AUDI", true, "A5.0", 5.2f, "Black", "Disel", "280bhp", 6);
	public void CarFeatures() {
		System.out.println("Brand Name : " + car.getCompany());
		System.out.println("Color of Car : " + car.getColor());
		System.out.println("Power : " + car.getPower());
		System.out.println("Fuel type : " + car.getFuelType());
		System.out.println("No of Gears" + car.getNumberOfGear());
	}
	@Override
	public void isAutomatic() {
		System.out.println("Is this Car automatic : " + car.isAutomatic());
	}
	@Override
	public void modelName() {
		System.out.println("Model name : " + car.getModelName());
	}
	@Override
	public void highTechAC() {
		System.out.println("Model name : " + car.getHighTechAC());
	}
}
class Car {
	String company;
	boolean isAutomatic;
	String modelName;
	float highTechAC;
	String color;
	String fuelType;
	String Power;
	int numberOfGear;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getHighTechAC() {
		return highTechAC;
	}

	public void setHighTechAC(float highTechAC) {
		this.highTechAC = highTechAC;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getPower() {
		return Power;
	}

	public void setPower(String power) {
		Power = power;
	}

	public int getNumberOfGear() {
		return numberOfGear;
	}

	public void setNumberOfGear(int numberOfGear) {
		this.numberOfGear = numberOfGear;
	}

	public Car(String company, boolean isAutomatic, String modelName, float highTechAC, String color, String fuelType,
			String power, int numberOfGear) {
		this.company = company;
		this.isAutomatic = isAutomatic;
		this.modelName = modelName;
		this.highTechAC = highTechAC;
		this.color = color;
		this.fuelType = fuelType;
		Power = power;
		this.numberOfGear = numberOfGear;
	}
}

public class Interface2 {
	public static void main(String arg[]) {
		System.out.println("Car manufacture in first plants");
		FirstPlant firstPlant = new FirstPlant();
		firstPlant.CarFeatures();
		firstPlant.isAutomatic();
		firstPlant.highTechAC();
		firstPlant.modelName();

		System.out.println("Car manufacture in Second plants");
		SecondPlant secondPlant = new SecondPlant();
		secondPlant.CarFeatures();
		secondPlant.isAutomatic();
		secondPlant.highTechAC();
		secondPlant.modelName();
	}
}
