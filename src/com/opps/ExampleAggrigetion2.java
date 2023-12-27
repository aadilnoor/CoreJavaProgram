package com.opps;

public class ExampleAggrigetion2 {
	String city;

	ExampleAggrigetion exampleAggrigetion;

	public static void Disp() {
		System.out.println("....END....");
	}

	ExampleAggrigetion2(ExampleAggrigetion exampleAggrigetion, String city) {

		this.exampleAggrigetion = exampleAggrigetion;
		this.city = city;
		System.out.println("ID : "+exampleAggrigetion.id + "\nNAME : " + exampleAggrigetion.name + "\nCITY : " + city);
	}

	public static void main(String[] args) {

		ExampleAggrigetion aggrigetion = new ExampleAggrigetion(101, "Aadil Noor");
		ExampleAggrigetion2 aggrigetion2 = new ExampleAggrigetion2(aggrigetion, "Mumbai");
		aggrigetion2.Disp();
	}

}
