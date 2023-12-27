package com.opps;

interface i1 {

	abstract void main();

	abstract void main2();

	abstract void main3();

}



class Run implements i1 {
	String name;
	int age;

	public Run(String name, int age) {
		this.age = age;
		this.name = name;
		System.out.println("NAME:" + name + "\nAGE:" + age);
	}

	public void main() {
		System.out.println("override method with super class");
	}

	public void main2() {
		System.out.println("override method with super class main2");
	}

	@Override
	public void main3() {

		System.out.println("override method with super class main3");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		Run obRun = new Run("Student", 18);

		obRun.main();
		obRun.main2();
		obRun.main3();

	}
}
